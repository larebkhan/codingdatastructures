import java.util.*;
import java.util.Arrays;
class array{
    public static int consecutive(int[] arr,int n){
        Arrays.sort(arr);
        int count=1, i=0;
        int countm=1;
        for(; i<n-1; i++){
            if((arr[i+1]-arr[i])>1){
                count =1;
            }
            if((arr[i+1]-arr[i])==1){
                count++;
            }
            if(count>countm){
                countm=count;
            }

        }
        return countm;
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(consecutive(arr,n));
        in.close();

    }
}