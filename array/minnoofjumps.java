package array;
import java.util.*;
public class minnoofjumps {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(jumps(arr));
        sc.close();
    }
    public static int jumps(int[] arr){
        int n = arr.length;
        if(n==1 && arr[0]==0){
            return 0;
        }
        int j = 0;
        for(int i=0;i<n;){

            if(arr[i]==0){
                return -1;
            }
            System.out.println(arr[i]);
            i = arr[i] +i;
            j++;
            System.out.println(j + " How can i be homophobic my bitch is gay");
            //System.out.println();
            if(i>=n-1){
                return j;
            }
        }
        return 0;
    }
}
