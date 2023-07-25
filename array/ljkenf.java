import java.util.*;
public class ljkenf {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(largmaxsum(n,arr,k));
        in.close();
    }
    public static int largmaxsum(int N, int[] A, int K){
        int i = 0, j = 0, sum = 0;
    int maxLen = Integer.MIN_VALUE;
 
    while (j < N) {
      sum += A[j];
      if (sum < K) {
        j++;
      }
      else if (sum == K) {
        maxLen = Math.max(maxLen, j-i+1);
        j++;
      }
      else if (sum > K) {
        while (sum > K) {
          sum -= A[i];
          i++;
        }
        if(sum == K){
          maxLen = Math.max(maxLen, j-i+1);
        }
        j++;
      }
    }
    return maxLen;
        

    } 

    
}
