package DynamicProgramming;
import java.util.*;
public class minimumscoretriangulationofpolygon {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i=0;i<n;i++){
            v[i] = sc.nextInt();
        }
        System.out.println(solveRec(v,0,n));
        sc.close();
    }
    public static int solveRec(int [] v,int i,int j){
        if(i+1==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            ans = Math.min(ans,v[i]*v[j]*v[k]+solveRec(v,i,k)+solveRec(v,k,j));
        }
        return ans;
    }
    public int solveTab(int[] v) {
        int n = v.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = 0;
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i+2;j<n;j++){
                int ans = Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    ans = Math.min(ans,v[i]*v[j]*v[k]+dp[i][k]+dp[k][j]);
                }
            dp[i][j] = ans;
            }
        }
        return dp[0][n-1];
    } 
}
