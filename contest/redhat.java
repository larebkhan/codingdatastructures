package contest;
import java.util.*;
public class redhat {
    public static int intersectionSizeTwo(int[][] matrix) {
        int n = matrix.length;
        int r = 2; 
        Arrays.sort(matrix, (a,b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);
        
        int maxvalset = matrix[0][1]; 
        int secmaxvalset = matrix[0][1] - 1; 
        
        for(int i = 1; i < n; i++) {
            int start = matrix[i][0], end = matrix[i][1];
            if(start > maxvalset) { 
                r += 2;
                maxvalset = matrix[i][1];
                secmaxvalset = matrix[i][1] - 1;
            } else if(start > secmaxvalset && start <= maxvalset) { 
                r += 1;
                secmaxvalset = maxvalset; 
                maxvalset = matrix[i][1]; 
            }
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        System.out.println(solve(a,b,n));
        sc.close();
    }
    public static int solve(int[] a,int[] b,int n){
        int[][] q = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                if(j==0)
                    q[i][j] = a[i];
                else
                    q[i][j] = b[i];
            }
        }
        return intersectionSizeTwo(q);
    }
}
