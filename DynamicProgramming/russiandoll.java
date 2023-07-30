package DynamicProgramming;
import java.util.*;
public class russiandoll {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxEnvelopes(arr));
    }
    public static int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] val1,int val2[]){
                if(val1[0]==val2[0]){
                    if(val1[1]>val2[1]){
                        return -8;
                    }
                    else{
                        return 5;
                    }
                }else{
                    if(val1[0]>val2[0]){
                        return 8;
                    }else{
                        return -2;
                    }
                }
            } 
        });
        int a[] = new int[arr.length];
        int n = a.length;
        for(int i=0;i<n;i++){
            a[i] = arr[i][1];
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]) ;
        }
        return solveTab( n, a);
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
}
