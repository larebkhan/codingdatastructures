package matrix;
import java.util.*;
public class spiraltraversal {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(spiral(matrix,r,c));
        sc.close();
    }
    public static ArrayList<Integer> spiral(int[][] matrix, int r, int c){
        ArrayList<Integer> li = new ArrayList<Integer>();
        int l=0,k=0;//l=starting index of row; k = starting index of column
        while(k<c && l<r){
            for(int i=k;i<c;++i){
                li.add(matrix[l][i]);
            }
            l++;
            for(int i=l;i<r;++i){
                li.add(matrix[i][c-1]);
            }
            c--;
            if(l<r){
                for(int i=c-1;i>=k;--i){
                    li.add(matrix[r-1][i]);
                }
            }
            r--;
            if(k<c){
                for(int i=r-1;i>=l;--i){
                    li.add(matrix[i][k]);
                }
                k++;
            }
        }
        Collections.reverse(li);
        return li;
    }
}
