package DynamicProgramming;
import java.util.*;
public class maximumheightbystackingcuboids {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxHeight(arr));
        /* for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } */
        sc.close();
    }
    public static int maxHeight(int[][] arr) {
        int n = arr.length;
        /* Vector<Integer> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                v.add(arr[i][j]);
            }
            Collections.sort(v);
            for (int j = 0; j < 3; j++) {
                arr[i][j] = v.get(j);
            }
            v.removeAll(v);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
        public int compare(int[] val1,int val2[]){
                if(val1[0]>val2[0]){
                    return 8;
                }else{
                    return -2;
                }
            }
        }); */
        for(int[] arr1 : arr) Arrays.sort(arr1);
        Arrays.sort(arr, (a, b) -> (b[2] - a[2] == 0 ? (b[1] - a[1] == 0 ? b[0] - a[0] : b[1] - a[1]) : b[2] - a[2]));
        return solveSpace(n, arr);
    }
    static boolean check(int[] base , int[] newbox){
        if(base[0]<=newbox[0] && base[1]<=newbox[1] && base[2]<=newbox[2] ){
            return true;
        }else{
            return false;
        }
    }
    static int solveSpace(int n,int[][] a){
        int[] currRow = new int[n+1];
        int[] nextRow = new int[n+1];
        for(int i = 0 ;i<=n;i++){
            nextRow[i] = 0;
            currRow[i] = 0;
        }
        for(int curr=n-1;curr>=0;curr--){
            for(int prev= curr-1;prev>=-1;prev--){
                int inc =0;
                if(prev==-1 || check(a[curr] , a[prev])){
                    inc = a[curr][2] + nextRow[curr+1];
                }
                int exc = 0 + nextRow[prev+1];
                int ans = Math.max(inc,exc);
                currRow[prev+1] = ans;
            }
            nextRow = currRow;
        }
        return nextRow[0];
    }
}
