package DynamicProgramming;
import java.util.*;
public class perfectsquares {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int tar = sc.nextInt();
        //int n = sc.nextInt();
        /* int[] dp = new int[tar];
        for(int i=0;i<n;i++){
            dp[i] = -1;
        } */
        System.out.println(solveTab(tar));
        sc.close();
    }
    public static int solveRec(int[] arr,int tar){
        //int n = arr.length;
        if(tar==0){
            return 0;
        }
        int ans = tar;
        for(int i=1;i*i<=tar;i++){
            ans = Math.min(ans,1 + solveRec(arr,tar-(i*i)));
            //System.out.println(ans);
        }
        return ans;
    }
     public static int solveMem(int tar,int []dp){
        //int n = arr.length;
        if(tar==0){
            return 0;
        }
        if(dp[tar]!=-1){
            return dp[tar];
        }
        int ans = tar;
        for(int i=1;i*i<=tar;i++){
            ans = Math.min(ans,1 + solveMem(tar-(i*i),dp));
            //System.out.println(ans);
        }
        dp[tar] = ans;
        return dp[tar];
    }
    public static int solveTab(int tar){
        //int n = arr.length;
        int[] dp = new int[tar+1];
        for(int i=0;i<=tar;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i =1;i<=tar;i++){
            //int ans = tar;
            for(int j=1;j*j<=tar;j++){
            if(i-(j*j)>=0)
            dp[i] = Math.min(dp[i],1 + dp[i-(j*j)]);
            //System.out.println(ans);
            }
        }
        return dp[tar];
    }
    
}
