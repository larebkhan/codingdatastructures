package DynamicProgramming;
import java.util.*;
public class pizzawith3nslices {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[]  slices= new int[n];
        for(int i=0;i<n;i++){
            slices[i] = sc.nextInt();
        }
        System.out.println(solveTab(slices));
        sc.close();
    }
    public static int solveTab(int[] s){
        int k = s.length;
        int[][] dp1 =new int[k+2][k+2];
        int[][] dp2 =new int[k+2][k+2];
        for(int i=0;i<k+1;i++){
            for(int j=0;j<k+1;j++){
                dp1[i][j]= 0 ; 
                dp2[i][j]= 0 ;          
            }
        }
        for(int index=k-2;index>=0;index--){
            for(int n=1;n<=k/3;n++){
                int inc = s[index] + dp1[index+2][n-1];
                int exc = 0 + dp2[index+1][n];
                dp1[index][n] = Math.max(inc,exc);
            }
        }
        int case1 = dp1[0][k/3];
        for(int index=k-1;index>=1;index--){
            for(int n=1;n<=k/3;n++){
                int inc = s[index] + dp2[index+2][n-1];
                int exc = 0 + dp2[index+1][n];
                dp2[index][n] = Math.max(inc,exc);
            }
        }
        int case2 = dp2[1][k/3];
        return Math.max(case1,case2);
    }
    public int maxSizeSlices(int[] slices) {
        int k = slices.length;
        int[][] dp1 =new int[k+1][k+1];
        int[][] dp2 =new int[k+1][k+1];
        for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                dp1[i][j]= -1 ; 
                dp2[i][j]= -1 ;          
            }
        }
        int case1 = solveMem(slices, 0,k-2,k/3,dp1);
        int case2 = solveMem(slices, 1,k-1,k/3,dp2);
        return Math.max(case1,case2);
    }
    public int solveMem(int[] s, int sindex, int eindex, int k,int[][] dp){
        if(k==0 || sindex>eindex){
            return 0;
        }
        if(dp[sindex][k]!=-1){
            return dp[sindex][k];
        }
        int inc = s[sindex] + solveMem(s, sindex+2, eindex, k-1,dp);
        int exc = 0 + solveMem(s, sindex+1, eindex, k,dp);
        dp[sindex][k] = Math.max(inc,exc);
        return dp[sindex][k];
    }
}
