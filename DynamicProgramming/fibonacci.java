package DynamicProgramming;
import java.util.*;
public class fibonacci {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] dp = new int[n+1];
            for(int i=0;i<n+1;i++){
                dp[i] = -1;
            }
            System.out.println(fibonacciNumber(n,dp));
            sc.close();
        }
        public static int fibonacciNumber(int n, int[] dp){
            // Write your code here.
            if(n==0 || n==1){
                return n;
            }
            if(dp[n]!=-1){
                return dp[n];
            }
            dp[n] = fibonacciNumber(n-1,dp) + fibonacciNumber(n-2,dp);
            return dp[n];
        }
    }
