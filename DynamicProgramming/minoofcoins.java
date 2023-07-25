package DynamicProgramming;
import java.util.*;
public class minoofcoins {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println(solveRec( num,x));
        sc.close();
    }
/* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
    static int solveRec(int[] num, int x){
        if(x==0){
            return 0;
        }
        if(x<0){
            return Integer.MAX_VALUE;
        }
        int min1 = Integer.MAX_VALUE;
        for(int i=0; i<num.length;i++){
            int ans = solveRec(num,x-num[i]);
            if(ans!=Integer.MAX_VALUE){
                System.out.println(ans+" ");
                min1 = Math.min(min1, 1+ans);//1+ans because this step is keeoing track of no. of coins we are using ans as the base condition 
                //is 0 so ans =0 and 1+ans =1 so 1 coin is used and at next iteration the same steps are follwed each time and the value gets inc by 1
                //intmax k equal is liye ho skta hai kyuki wo solverec wale func ki condition dekho usme bi hai if(ans!=inmax) taki wo no. jinka
                //given denomination jo use kar rae usse pohochna possible hi nai hai wo skip ho kaye.
                
            }
            //System.out.println();
            //System.out.print(min1+" ");
        }

        return min1;
    }
/* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
    static int solveMem(int[] num, int x,int[] dp){
        if(x==0){
            return 0;
        }
        if(x<0){
            return Integer.MAX_VALUE;
        }
        if(dp[x]!= -1)
            return dp[x];
        int min1 = Integer.MAX_VALUE;
        for(int i=0; i<num.length;i++){
            int ans = solveMem(num,x-num[i],dp);
            if(ans!=Integer.MAX_VALUE)
                min1 = Math.min(min1, 1+ans);
        }
        dp[x] = min1;
        return dp[x];
    }
/* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
    static int solveTab(int[] num , int x){
        int[] dp = new int[x+1];
        for(int i=0;i<x+1;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=1;i<=x;i++){
            //trying to solve for every x figure like we hava to find the min no. of coins for 7 so in recursive aprraoch we first fing f(7)-> f(6)->f(5) and so on
            //so we will find the value of dp[7]->dp[6]->dp[5] and so on by a for loop from 1 to 7 (and in this for loop for every x we will have to use each denomination of coins)
            //so we will have another for loop for 
            for(int j=0;j<num.length;j++){
                if(i-num[j]>=0 && dp[i-num[j]] != Integer.MAX_VALUE) //dp[i-num[j]] != Integer.MAX_VALUE this condition is to prevent the integer overflow which can occur 
                                                                     //if we add 1 to it as done in the next step.
                    dp[i] = Math.min(dp[i],1 + dp[i-num[j]]);
            }
        }
        if(dp[x]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[x];
    }
/* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int[] dp = new int[x+1];
        for(int i=0;i<x+1;i++){
            dp[i] = -1;
        }
        int ans = solveMem(num,x,dp);
        // for(int i=0;i<num.length;i++){
        //     System.out.println(dp[i]);
        // }
        if(ans==Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
