package array;
import java.util.*;
public class hcltest {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(max_sum(n,arr));
        in.close();
    }
    public static int max_sum(int n, int[] arr){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0||arr[i]==1){
                continue;
            }
            if((arr[i]-1^1)==arr[i]&&((arr[i]-1)&1)==0){
                count++;
            }
        }
        return count;
    }
}
