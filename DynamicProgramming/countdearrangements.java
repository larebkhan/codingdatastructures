package DynamicProgramming;
import java.util.*;
public class countdearrangements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(disarrange(n));
        sc.close();
    }
    static long solveTab(int n){
        long M = 1000000007;
        long[] dp = new long[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        dp[1] = 0;
        dp[2] = 1;
        for(int i= 3;i<=n;i++){
            // long first = dp[i-1]%M;
            // long second = dp[i-2]
            long ans = (((i-1)%M)*(((dp[i-2])%M) + ((dp[i-1]%M))))%M;
            //System.out.println(ans);
            dp[i] = ans;
        }
        return dp[n];
    }
    static long solveMem(int n , long[] dp){
        long M = 1000000007;
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long ans = (((n-1)%M)*((solveMem(n-2,dp))%M + ((solveMem(n-1,dp)%M))))%M;
        dp[n] = ans;
        return dp[n];
    }
    static long disarrange(int n){
        // code here
        // long[] dp = new long[n+1];
        // for(int i=0;i<n+1;i++){
        //     dp[i] = -1;
        // }
        // long ans = solveMem(n,dp);
        // return ans;
        return solveTab(n);
    }
}
