package DynamicProgramming;
import java.util.*;
public class cutrodintosegofxyz {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(solveTab(n,x,y,z));
        sc.close();
    }
    public static int solvingRec(int n,int x,int y,int z){
        if(n==0){
            //System.out.println(n);
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;
        }
        int a = solvingRec(n-x, x, y, z)+1;
        int b = solvingRec(n-y, x, y, z)+1;
        int c = solvingRec(n-z, x, y, z)+1;
        int ans = Math.max(a,Math.max( b,c));
        return ans;
    }
    public static int solveTab(int n ,int x,int y,int z){
        int [] dp = new int[n+1];
        for(int i=0 ; i<n ; i++){
            dp[i] = Integer.MIN_VALUE;
        }
        dp[0]= 0;
        for(int i = 1; i<n ;i++){
            if(i-x>=0){
            dp[i] = Math.max(dp[i],dp[i-x]+1);
            }
            if(i-y>=0){
            dp[i] = Math.max(dp[i],dp[i-y]+1);
            }
            if(i-z>=0){
            dp[i] = Math.max(dp[i],dp[i-z]+1);
            }
            //dp[n] = Math.max(a,Math.max(b,c));
        }
        if(dp[n]<0){
            return 0;
        }else
        return dp[n];

    }
    /* public static int solvingTab(int n,int x,int y,int z){
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        if(solveMem(n,x,y,z,dp)<0){
            return 0;
        }else{
            return solveMem(n,x,y,z,dp);
        }
        

    }    
    public static int solve(int n ,int x,int y,int z){
        //base case
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;
        }
        x = solve(n-x,x,y,z)+1;
        y = solve(n-y,x,y,z)+1;
        z = solve(n-z,x,y,z)+1;
        int ans = Math.max(x,Math.max(y,z));
        return ans;
    }
    public static int solveMem(int n ,int x,int y,int z,int[] dp){
        //base case
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a = solveMem(n-x,x,y,z,dp)+1;
        int b = solveMem(n-y,x,y,z,dp)+1;
        int c = solveMem(n-z,x,y,z,dp)+1;
        dp[n] = Math.max(a,Math.max(b,c));
        return dp[n];

    } */

}
