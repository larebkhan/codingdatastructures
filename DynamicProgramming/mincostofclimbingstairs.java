package DynamicProgramming;
import java.util.*;
public class mincostofclimbingstairs {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }
        //int[] dp = new int[n+1];
        /* for(int i = 0 ; i<n;i++){
            dp[i] = -1;
        } */
        //int ans = Math.min(solve(cost,n-1),solve(cost,n-2));
        System.out.println(solve(cost,n));
        sc.close();
    }
    public static int solve(int[] cost,int n){
       /*  if(i==0){
            return cost[0];
        }
        if(i==1){
            return cost[1];
        } */
        int prev2 = cost[0];
        int prev1 = cost[1];
        /* if(dp[i]!=-1)
        return dp[i]; */
        for(int i=2;i<n;i++){
            int curr1 = Math.min(prev1,prev2)+ cost[i];
            prev2 = prev1;
            prev1 = curr1;
        }
        
        return Math.min(prev1,prev2);
    }
}
