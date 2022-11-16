package Recursion;
import java.util.*;
public class sudukosolver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        solved(grid);
        sc.close();
    }
    public static void solved(char[][] grid){
        SolveSudoku(grid);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean SolveSudoku(char grid[][])
    {
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    for(char c = '1';c<='9';c++){
                        if(isValid(grid,i,j,c)){
                            grid[i][j] = c;
                            if(SolveSudoku(grid)){
                                return true;
                            }else{
                                grid[i][j] = '0';
                            }
                        }
                    }
                    return false;
                }
            }
         }
         return true;
    }
    public static boolean isValid(char[][] grid,int row,int col, char c ){
        for(int i=0;i<0;i++){
            if(c==grid[row][i]){
                return false;
            }
            if(c==grid[i][col]){
                return false;
            }
            if(grid[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==c){
                return false;
            }
        }
        return true;

    }
}
