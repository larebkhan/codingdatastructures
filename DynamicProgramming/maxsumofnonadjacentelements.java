package DynamicProgramming;
import java.util.*;
public class maxsumofnonadjacentelements {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
        sc.close();
    }
    public static int solve(int[] arr){
        int n = arr.length;
        return (solveTab(arr));
    }
    public static int solveTab(int[] arr){
        int n = arr.length;
        int [] dp =new int[n+1];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[1],arr[0]);
        for(int i =2;i<n;i++){
            int inc = dp[i-2]+ arr[i];
            int exc = dp[i-1]+0;
            dp[i] =  Math.max(inc,exc);
        }
        //System.out.println(dp);
        return dp[n-1];
    }
    public static int solveMem(int n,int[] arr,int[] dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return arr[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        //System.out.println(arr[n]);
        int inc = solveRec(n-2,arr) + arr[n];
        int exc = solveRec(n-1,arr)+0;
        dp[n] =  Math.max(inc,exc);
        return dp[n];
    }
    
    public static int solveRec(int n,int[] arr){
        if(n<0){
            return 0;
        }
        if(n==0){
            return arr[0];
        }
        //System.out.println(arr[n]);
        int inc = solveRec(n-2,arr) + arr[n];
        int exc = solveRec(n-1,arr)+0;
        return Math.max(inc,exc);
    }
   
    

    /* public static int solving(int[] arr){
        return solveTab(arr);
    }
    public static int solve(int[] arr ,int n,int[] dp){
        if(n<0){
            return 0;
        }
        if(n == 0){
            return arr[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        //dp[0] = arr[0];
        int inc = solve(arr,n-2,dp)+ arr[n] ;
        int exc = solve(arr,n-1,dp)+ 0;
        dp[n] = Math.max(inc,exc);
        return dp[n];
    }
    public static int solveTab(int[] arr){
        int n = arr.length; 
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = 0;
        }
        dp[0] = arr[0];
        for(int i =1;i<n;i++){
            if(i-2<0){
                int inc = arr[i];
                int exc = dp[i-1];
                dp[i] = Math.max(inc,exc);
            }
            else{
            int inc = dp[i-2] + arr[i];
            int exc = dp[i-1]+0;
            dp[i] = Math.max(inc,exc);
            }
            
        }
        return dp[n-1];  

    } */


}
