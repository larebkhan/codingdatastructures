package DynamicProgramming;
import java.util.*;
public class buyandsellstock3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
        sc.close();
    }
    static int profit = 0;
    public static int maxProfit(int[] arr) {
        //int n = arr.length;
        /*int[][][] dp = new int[n][2][3];
        for(int i =0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k] = -1;
                }
            }
        }*/
        return solveSpace(arr);
    }
    public static int solveRec(int[] arr, int index, boolean buy,int limit){
        if(index == arr.length){
            return 0;
        }
        if(limit == 0){
            return 0;
        }
        //int save = buy?1:0;
        /*if(dp[index][save]!=-1){
            return dp[index][save];
        }*/
        if(buy){
            profit = Math.max((-arr[index]+solveRec(arr,index+1,false,limit)),(0 + solveRec(arr, index+1,true,limit)));
            //dp[index][0] = profit;
        }else{
            profit = Math.max((arr[index]+solveRec(arr,index+1,true,limit-1)),(0 + solveRec(arr, index+1,false,limit)));
            //dp[index][1] = profit; 
        }
        return profit;
    }
    public static int solveMem(int[] arr, int index, boolean buy,int limit,int[][][] dp){
        if(index == arr.length){
            return 0;
        }
        if(limit == 0){
            return 0;
        }

        int save = buy?1:0;
        if(dp[index][save][limit]!=-1){
            return dp[index][save][limit];
        }
        if(buy){
            profit = Math.max((-arr[index]+solveMem(arr,index+1,false,limit,dp)),(0 + solveMem(arr, index+1,true,limit,dp)));
            //dp[index][0] = profit;
        }else{
            profit = Math.max((arr[index]+solveMem(arr,index+1,true,limit-1,dp)),(0 + solveMem(arr, index+1,false,limit,dp)));
            //dp[index][1] = profit; 
        }
        return dp[index][save][limit]=profit;
    }
    public static int solveTab(int[] arr){
        int n = arr.length;
        
        int[][][] dp = new int[n+1][2][3];
        for(int i =0;i<=n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k] = 0;
                }
            }
        }
        for(int index=n-1;index>=0;index--){
            for(int buy=0;buy<=1;buy++){
                for(int limit=1;limit<=2;limit++){
                    if(buy==1){
                    profit = Math.max((-arr[index]+dp[index+1][0][limit]),(0 + dp[index+1][1][limit]));
                    //dp[index][0] = profit;
                    }else{
                        profit = Math.max((arr[index]+dp[index+1][1][limit-1]),(0 + dp[index+1][0][limit]));
                        //dp[index][1] = profit; 
                    }
                    dp[index][buy][limit]=profit;
                }
            }
        }
        return dp[0][1][2];
    }
    public static int solveSpace(int[] arr){
        int n = arr.length;
        
        int[][] curr = new int[2][3];
        int[][] next = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                curr[i][j] = 0;
                next[i][j] = 0;
            }
        }
        for(int index=n-1;index>=0;index--){
            for(int buy=0;buy<=1;buy++){
                for(int limit=1;limit<=2;limit++){
                    if(buy==1){
                    profit = Math.max((-arr[index]+next[0][limit]),(0 + next[1][limit]));
                    //dp[index][0] = profit;
                    }else{
                        profit = Math.max((arr[index]+next[1][limit-1]),(0 + next[0][limit]));
                        //dp[index][1] = profit; 
                    }
                    curr[buy][limit]=profit;
                }//this is to certify that this can be haz
            }
            next = curr;
        }
        return next[1][2];
    }
}
