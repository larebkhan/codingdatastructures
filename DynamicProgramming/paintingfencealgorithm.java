package DynamicProgramming;
import java.util.*;
public class paintingfencealgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(dearrange(n,k));
        sc.close();
    }
    public static long add(long a,long b){
        long ans = ((a%1000000007)+(b%1000000007))%1000000007;
        return ans;
    }
    public static long mul(long a,long b){
        long ans = ((a%1000000007)*(b%1000000007))%1000000007;
        return ans;
    }
    public static long solve(long n,long k){
        if(n==1){
            return k;
        }
        if(n==2){
            return add(k,mul(k,k-1));
        }
        long ans = add(mul(k-1,solve(n-2,k)),mul(solve(n-1,k),k-1));
        return ans;
    }
    public static long solveMem(int n,long k,long[] dp){
        if(n==1){
            return k;
        }
        if(n==2){
            return add(k,mul(k,k-1));
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = add(mul(k-1,solveMem(n-2,k,dp)),mul(solveMem(n-1,k,dp),k-1));
        return dp[n];
    }
    public static long solveTab(int n,int k){
        long[] dp = new long[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = 0;
        }
        dp[1] = k;
        if(n>1){
        dp[2] = add(k,mul(k,k-1));
        }
        //System.out.println(dp[2]);
        // if(dp[n]!=-1){
        //     return dp[n];
        // }
        for(int i=3;i<=n;i++){
            long ans= add(mul(k-1,dp[i-2]),mul(dp[i-1],k-1));
            dp[i] = ans;
        }
        return dp[n];
    }
    public static long dearrange(int n, int k){
        // int[] dp = new int[n+1];
        // for(int i=0;i<=n;i++){
        //     dp[i] = -1;
        // }
        // int ans = solveMem(n,k,dp);
        // return ans;
        return solveTab(n,k);
    }
}
