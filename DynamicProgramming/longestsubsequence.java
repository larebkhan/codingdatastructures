package DynamicProgramming;
import java.util.*;
public class longestsubsequence {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] =sc.nextInt() ;
        }
        System.out.println(longestSubsequence(size, a));
        sc.close();
    }
    static int longestSubsequence(int size, int a[])
    {
        // code here
        /* int[][] dp = new int[size+1][size+1];
        for(int i = 0 ;i<=size;i++){
            for(int j = 0;j<=size;j++){
                dp[i][j] = -1;
            }
        }
        return longestSubsequence(size, a,0,-1,dp); */
        //return solveTab(size,a);
        return optimal(size,a);
    }
    static int optimal(int n , int[] a){
        if(n==0){
            return 0;
        }
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(a[0]);
        for(int i=0;i<n;i++){
            if(a[i]>li.get(li.size()-1)){
                li.add(a[i]);
            }else{
                for(int j= 0; j < li.size(); j++) {
                    if(a[i]<li.get(j)){
                        li.set(j, a[i]);
                        break;
                    }else{
                        continue;
                    }
                }
            }
        }
        return li.size();
        
    }
    static int solveSpace(int n,int[] a){
        int[] currRow = new int[n+1];
        int[] nextRow = new int[n+1];
        for(int i = 0 ;i<=n;i++){
            nextRow[i] = 0;
            currRow[i] = 0;
        }
        for(int curr=n-1;curr>=0;curr--){
            for(int prev= curr-1;prev>=-1;prev--){
                int inc =0;
                if(prev==-1 || a[curr]>a[prev]){
                    inc = 1 + nextRow[curr+1];
                }
                int exc = 0 + nextRow[prev+1];
                int ans = Math.max(inc,exc);
                currRow[prev+1] = ans;
            }
            nextRow = currRow;
        }
        return nextRow[0];
    }
    static int solveTab(int n,int[] a){
        int dp[][] = new int[n+1][n+1];
        for(int i = 0 ;i<=n;i++){
            for(int j = 0;j<=n;j++){
                dp[i][j] = 0;
            }
        }
        for(int curr=n-1;curr>=0;curr--){
            for(int prev= curr-1;prev>=-1;prev--){
                int inc =0;
                if(prev==-1 || a[curr]>a[prev]){
                    inc = 1 + dp[curr+1][curr+1];
                }
                int exc = 0 + dp[curr+1][prev+1];
                int ans = Math.max(inc,exc);
                dp[curr][prev+1] = ans;
            }
        }
        return dp[0][0];
    }
    static int longestSubsequence(int size, int a[],int curr,int prev,int [][] dp){
        // code here
        if(curr==size){
            return 0;
        }
        //include
        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];
        }
        int inc =0;
        if(prev==-1 || a[curr]>a[prev]){
            inc = 1 + longestSubsequence(size,a,curr+1,curr,dp);
        }
        int exc = 0 + longestSubsequence(size,a,curr + 1,prev,dp);
        int ans = Math.max(inc,exc);
        dp[curr][prev+1] = ans;
        return ans;
    }
}
