package DynamicProgramming;
import java.util.*;
public class largestsquareareainmatrix {
    static int maxi = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxSquare(0,0,mat));
        //System.out.println(maxi);
        sc.close();
    }
    /* public static int solveRec(int[][] mat,int i, int j,int max){
        if(i >= mat.length || j>=mat[0].length ){
            return 0;
        }
        int row = 1 + solveRec(mat,i,j+1,max);
        int col = 1 + solveRec(mat,i+1,j,max);
        int diag = 1 + solveRec(mat, i+1,j, max);


        if(mat[i][j]==1){
            int ans = Math.min(row,Math.min(col,diag));
            max = Math.max(max,ans);
            maxi = max;
            return maxi;
        }else{
            return 0;
        }
    } */
    static int maxSquare(int n, int m, int mat[][]){
        // code here
        int[] max = new int[]{0};
        int ans1=solveRec( mat,n,m,max);
        //System.out.println(ans1+"hi");
        return ans1;
    }
    static int solveRec(int[][] mat,int i, int j,int[] max){
        if(i >= mat.length || j>=mat[0].length ){
            return 0;
        }
        int row = 1 + solveRec(mat,i,j+1,max);
        int col = 1 + solveRec(mat,i+1,j,max);
        int diag = 1 + solveRec(mat, i+1,j, max);


        if(mat[i][j]==1){
            int ans =1+  Math.min(row,Math.min(col,diag));
            max[0]= Math.max(max[0],ans);
            //System.out.println(max[0]);
            //max[0] = max;
            //System.out.println(maxi);
            return max[0];
        }else{
            return 0;
        }
    }
}
