package DynamicProgramming;
import java.util.*;
public class knapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] wt = new int[n];
        int[] value = new int[n];
        for(int i=0;i<n;i++){
            wt[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            value[i]=sc.nextInt();
        }
        /* int[][] dp = new int[n][W+1];
        for(int i =0;i<n;i++){
            for(int j=0;j<=W;j++){
                dp[i][j] = -1;
            }
        } */
        System.out.println(solveTab(wt,value,n,W));
        sc.close();
    }
     public static int solveTab(int[] wt, int[] value, int n, int W){
        int [][] dp = new int[n][W+1];
        for(int k=0;k<n;k++){
            for(int l=0;l<=W;l++){
                dp[k][l] = 0;
            }
        }
        
        for(int i = wt[0];i<=W;i++){
            if(wt[0]<=W)dp[0][i]=value[0];
            else
            dp[0][i]=0;
        } 
        for(int i=1;i<n-1;i++){
            for(int j=0;j<=W;j++){
                int inc =0;
                if(wt[i]<=j)
                {
                    inc = value[i] + dp[i-1][j-wt[i]];
                    System.out.println(inc+"hi");
                }
                int exc = 0 + dp[i-1][j];
                dp[i][j] = Math.max(inc,exc);
                //System.out.println(dp[i][j]);
            }
        }
        /* for(int k=0;k<n;k++){
            for(int l=0;l<=W;l++){
                System.out.println(dp[k][l]);
            }
        } */
        return dp[n-1][W];
    }
    public static int solve(int[] wt, int[] value, int n, int W){
        if(n==0){
            if(wt[0]<=W){
                return value[0];
            }else{
                return 0;
            }
        }
        int inc=0;
        if(wt[n]<=W){
            inc = value[n]+solve(wt, value, n-1, W-wt[n]);
            //System.out.println(inc);
        }
        int exc = 0 + solve(wt, value, n-1, W);
        int ans = Math.max(inc,exc);
        return ans;
    }
    public static int solveMem(int[] wt, int[] value, int n, int W,int[][] dp){
        if(n==0){
            if(wt[0]<=W){
                return value[0];
            }else{
                return 0;
            }
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        int inc=0;
        if(wt[n]<=W){
            inc = value[n]+solveMem(wt, value, n-1, W-wt[n],dp);
            //System.out.println(inc);
        }
        int exc = 0 + solveMem(wt, value, n-1, W,dp);
        dp[n][W] = Math.max(inc,exc);
        return dp[n][W];
    }
   
}