package DynamicProgramming;
import java.util.*;
class buyandsellstock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //        int n=sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solveRec(arr,n));
        sc.close();
    }
    public static  int solveRec(int[] arr,int n){
        int profit = 0;
        
        int mini = arr[0];
        for(int i=1; i<n;i++){
            int diff = arr[i] - mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, arr[i]);
        }
        return profit; 
    }
}