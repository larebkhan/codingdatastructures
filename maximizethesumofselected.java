import java.util.*;
public class maximizethesumofselected {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxxx(arr,n));
        sc.close();
    }
    public static int maxxx(int[] arr, int n){
        int max = arr[n-1];
        int sum =0;
        int[] f = new int[max+1];
        for(int i=0;i<n;i++){
            f[arr[i]]++;
        }
        for(int j=n-1;j>=0;j--){
            if(f[arr[j]]>0){
                sum = sum + arr[j];
                f[arr[j]]--;
                f[arr[j]-1]--;
            }
        }
        return sum;
    }
}
