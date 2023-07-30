package array;
import java.util.*;

public class maxsumsubarra{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(max_sum(n,arr,k));
        in.close();
    }
    public static int  max_sum(int size, int [] arr, int k){
        int i = 0, j=0, sum=0;
        int minsum = Integer.MAX_VALUE;;
        while(j<size-1){
            if((j-i+1)>k){
                sum = sum - arr[i];
                i++;
                j++;
                sum = sum + arr[j];
                continue;
            }else if((j-i+1)==k){
                sum = sum + arr[j];
                if(sum<minsum){
                    minsum = sum;
                }
                j++;
            }else{
                sum = sum + arr[j];
                j++;
            }
        }
        return minsum;
    }
}