import java.util.*;
public class stockp1{
    
    public static void profit(int arr[],int n){
        int maxp = 0;
        int min=arr[0];
        for(int i=1;i<n;i++){
            /*if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }*/
            if(min<arr[i]){
                if(maxp<(arr[i]-min)){
                    maxp=arr[i]-min;
                }
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(maxp);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        profit(arr, n);
        sc.close();
    }
}