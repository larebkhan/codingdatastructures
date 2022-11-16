package DynamicProgramming;
import java.util.*;
public class minoofcoins {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println(minimumElements(num, x));
        sc.close();
    }
    static int solveMem(int[] num, int x,int[] dp){
        if(x==0){
            return 0;
        }
        if(x<0){
            return Integer.MAX_VALUE;
        }
        if(dp[x]!= -1)
            return dp[x];
        int min1 = Integer.MAX_VALUE;
        for(int i=0; i<num.length;i++){
            int ans = solveMem(num,x-num[i],dp);
            if(ans!=Integer.MAX_VALUE)
                min1 = Math.min(min1, 1+ans);
        }
        dp[x] = min1;
        return dp[x];
    }
    static int solveRec(int[] num, int x){
        if(x==0){
            return 0;
        }
        if(x<0){
            return Integer.MAX_VALUE;
        }
        int min1 = Integer.MAX_VALUE;
        for(int i=0; i<num.length;i++){
            int ans = solveRec(num,x-num[i]);
            if(ans!=Integer.MAX_VALUE){
                System.out.println(ans+" ");
                min1 = Math.min(min1, 1+ans);
            }
            //System.out.println();
            //System.out.print(min1+" ");
        }

        return min1;
    }
    static int solveTab(int[] num , int x){
        int[] dp = new int[x+1];
        for(int i=0;i<x+1;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=1;i<=x;i++){
            //trying to solve for every x figure 
            for(int j=0;j<num.length;j++){
                if(i-num[j]>=0 || i!= Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i],1 + dp[i-num[j]]);
            }
        }
        if(dp[x]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[x];
    }
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int[] dp = new int[x+1];
        for(int i=0;i<x+1;i++){
            dp[i] = -1;
        }
        int ans = solveMem(num,x,dp);
        // for(int i=0;i<num.length;i++){
        //     System.out.println(dp[i]);
        // }
        if(ans==Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
