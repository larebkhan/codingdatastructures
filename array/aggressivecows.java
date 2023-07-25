import java.util.*;
public class aggressivecows {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(n,k,arr));
        sc.close();
    }
    public static int solve(int n,int k, int[] arr){
        Arrays.sort(arr);
        int low = 1, high = arr[n-1] - arr[0]; int res =1;
        while(low<=high){
            int mid = (high + low)/2;
            if(canPlace(arr,n,k,mid)){
                //System.out.println("hi");
                res = mid;
                //System.out.println(res);
                low = mid+1;
            }else{
                high = mid-1;
            }
            //System.out.println("hi");
        }
        return res;
    }
    public static boolean canPlace(int[] arr, int n, int k, int mid){
        int cord = arr[0], count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]-cord>=mid){
                cord = arr[i];
                count++;
                //System.out.println(count);
            }
            if(count == k){
            return true;
            }
        }
        return false; 
    }
}
