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
        System.out.println(canPartition(n,nums));
        sc.close();
    }
    public static  boolean canPartition(int n,int[] nums) {
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
        System.out.print(target-nums[index]+" ");
        boolean inc = solveRec(nums,target-nums[index],index+1);
        boolean exc = solveRec(nums,target,index+1);
        return (inc||exc);
    }
}
