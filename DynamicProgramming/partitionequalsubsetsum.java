package DynamicProgramming;
import java.util.*;
public class partitionequalsubsetsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        System.out.println(equalPartition(n,nums));
        sc.close();
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            sum = sum + arr[i];
        }
        int tar = sum/2;
        if(sum%2!=0){
            //System.out.println("hi");
            return 0;
        }
        int[][] dp = new int[N+1][tar+1];
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
              dp[i][j] = -1;  
            }
        }
    if(solveMem(N,arr,tar,0,dp)==true){
            return 1;
        }else if(solveMem(N,arr,tar,0,dp)==false){
            //System.out.println("hi");
            return 0;
        }
        //return solveMem(N,arr,tar,0,dp);
    }
    /*public static  boolean canPartition(int n,int[] nums) {
        int sum=0;
        //int n = nums.length;
        for(int i=0;i<n;i++){
            sum = sum +  nums[i];
        }
        System.out.println(sum);
        if(sum%2!=0){
            return false;
        }
        int target = sum/2;
        return solveRec(nums,target,0);
    }
    public static boolean solveRec(int[] nums, int target,int index){
        if(index>=nums.length){
            return false; 
        }
        if(target<0){
            return false;
        }
        if(target==0){
            return true;
        }
        // System.out.print(target-nums[index]+" ");
        boolean inc = solveRec(nums,target-nums[index],index+1);
        boolean exc = solveRec(nums,target,index+1);
        return (inc||exc);
    } */
    static boolean solveMem(int N , int nums[],int target, int index,int[][] dp){
        if(index>=nums.length){
            System.out.println("hi");
            return false;
        }
        if(target<0){
            System.out.println("hi2");
            return false;
        }
        if(target==0){
            System.out.println("hi3");
            return true;
        }
        if(dp[index][target]!=-1){
            if(dp[index][target]==1)
            return true;
            if(dp[index][target]==0)
            return false;
            //return dp[index][target];
        }
        boolean inc = solveMem(N,nums,target-nums[index],index+1,dp);
        boolean exc = solveMem(N,nums,target,index+1,dp);
        if(inc||exc){
            dp[index][target] =1;
        }else{
            dp[index][target]=0;
        }
        return (inc||exc);
    }
}
