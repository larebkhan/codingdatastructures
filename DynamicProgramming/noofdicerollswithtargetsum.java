package DynamicProgramming;
import java.util.*;
public class noofdicerollswithtargetsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[][] dp = new int[N+1][X+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=X;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(solveTab(M,N,X));
        sc.close();
    }
    public static long solveTab(int f,int d,int t){
        long[][] dp = new long[d+1][t+1];
        for(int i=0;i<=d;i++){
            for(int j=0;j<=t;j++){
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;
        for(int dice=1;dice<=d;dice++){
            for(int target = 1;target<=t;target++){
                long ans=0;
                for(int i=1;i<=f;i++){
                    if(target-i>=0)
                    ans = ans + dp[dice-1][target-i];
                }
                dp[dice][target]= ans;
            }
        }
        return dp[d][t];
    }
    public static int solveRec(int dice,int face,int target){
        if(target<0){
            return 0;
        }
        if(dice!=0 && target==0){
            return 0;
        }
        if(dice==0 && target!=0){
            return 0;
        }
        if(dice==0 && target==0){
            return 1;
        }
        int ans=0;
        for(int i=1;i<=face;i++){
            ans = ans + solveRec(dice-1,face,target-i);
        }
        return ans;
    }
     public static int solveMem(int dice,int face,int target,int[][] dp){
        if(target<0){
            return 0;
        }
        if(dice!=0 && target==0){
            return 0;
        }
        if(dice==0 && target!=0){
            return 0;
        }
        if(dice==0 && target==0){
            return 1;
        }
        if(dp[dice][target]!=-1){
            return dp[dice][target];
        }
        int ans=0;
        for(int i=1;i<=face;i++){
            ans = ans + solveMem(dice-1,face,target-i,dp);
        }
        dp[dice][target]= ans;
        return ans;
    }
}
