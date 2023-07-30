package array;
import java.util.*;
public class trappingrainwater {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(trappingWater(arr,  n));

        in.close();
        /*long[] arr1 = trappingWater(arr, n);
        for(int i =0; i<n;i++){
            System.out.println(arr1[i]);
        }*/

    }
    static long trappingWater(long arr[], int n) { 
        // Your code here
        long m =arr[0];
        long j = arr[n-1];
        long sum = 0;
        long l =0;
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
        for(int i=0;i<n;i++){
            if(arr[i]<=m){
                arr1[i] =m;
            }else{
                arr1[i]=arr[i];
                m = arr[i];
            }
            
        }for(int i=n-1;i>=0;i--){
            if(arr[i]<=j){
                arr2[i] = j;
            }else{
                arr2[i]=arr[i];
                j = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            l = Math.min(arr1[i],arr2[i])-arr[i];
            sum+=l;
            }
        return sum;
    }
}
