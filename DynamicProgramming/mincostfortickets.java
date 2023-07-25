package DynamicProgramming;
import java.util.*;
public class mincostfortickets {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost[] = new int[n];
        int k = sc.nextInt();
        int travel[] = new int[k];
        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }
        for(int i=0;i<k;i++){
            travel[i] = sc.nextInt();
        }
        int dp[] = new int[k+1];
        
        System.out.println(solveTab(k,cost,travel));
        sc.close();
    }
    public static int solveRec(int k,int [] cost, int [] travel,int index){
        if(index>=k){
            return 0;
        }
        //1 day pass
        int op1 = cost[0] + solveRec(k,cost,travel,index+1);

        int i;
        for(i=index;i<k && travel[i]<travel[index]+7;i++);
        int op2 = cost[1] + solveRec(k,cost,travel,i);

        for(i=index;i<k && travel[i]<travel[index]+30;i++);
        int op3 = cost[2] + solveRec(k,cost,travel,i);

        return Math.min(op1, Math.min(op2,op3));

    }
    public static int solveMem(int k,int [] cost, int [] travel,int index,int[] dp){
        if(index>=k){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        //1 day pass
        int op1 = cost[0] + solveRec(k,cost,travel,index+1);

        int i;
        for(i=index;i<k && travel[i]<travel[index]+7;i++);
        int op2 = cost[1] + solveRec(k,cost,travel,i);

        for(i=index;i<k && travel[i]<travel[index]+30;i++);
        int op3 = cost[2] + solveRec(k,cost,travel,i);
        
        dp[index] = Math.min(op1, Math.min(op2,op3));
        return dp[index];

    }
     public static int solveTab(int k,int [] cost, int [] travel){
        int [] dp = new int[k+1];
        for(int i=0;i<=k;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[k] = 0;
        int z;
        //int ans=0;
        for(z=k-1;z>=0;z--){
            int op1 = cost[0] + dp[z+1];

            int i;
            for(i=z;i<k && travel[i]<travel[z]+7;i++);
            int op2 = cost[1] + dp[i];

            for(i=z;i<k && travel[i]<travel[z]+30;i++);
            int op3 = cost[2] + dp[i];
            dp[z] = Math.min(op1, Math.min(op2,op3));
            
        }
        
        return dp[0];//as the bottom up approach is present so ans will be at last dp[0]

    }
}
