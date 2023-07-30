package array;
import java.util.*;
public class sortinga2darray {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sorting(arr,n );
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void sorting(int[][]arr, int n){
        /* Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] val1,int val2[]){
                if(val1[0]==val2[0]){
                    if(val1[1]>val2[1]){
                        return -8;
                    }
                    else{
                        return 5;
                    }
                }else{
                    if(val1[0]>val2[0]){
                        return 8;
                    }else{
                        return -2;
                    }
                }
            }
            
        }); */
        for(int[] arr1 : arr) Arrays.sort(arr1);
        Arrays.sort(arr, (b, a) -> (b[2] - a[2] == 0 ? (b[1] - a[1] == 0 ? b[0] - a[0] : b[1] - a[1]) : b[2] - a[2]));
    }
}
