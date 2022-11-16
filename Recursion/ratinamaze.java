package Recursion;
import java.util.*;
public class ratinamaze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(grid,n));
        sc.close();
    }
    public static ArrayList<String> solve(int[][] grid,int n){
        ArrayList<String> li = new ArrayList<>();
        String st = "";
        int[][] vis = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j] = 0;
            }
        }
        //String pat = "DRLU";
        if(grid[0][0]==1)ratmaze(0,0,st,vis,grid,li,n);
        return li;
    }
    public static void ratmaze(int i,int j,String st,int[][] vis,int[][] grid,ArrayList<String> li,int n){
        if(i==n-1 && j==n-1){
            li.add(st);
        }
        //downward
        if((i+1)<n && vis[i][j]==0 && grid[i+1][j]==1){
            vis[i][j] = 1;
            ratmaze(i+1,j,st+"D",vis,grid,li,n);
            vis[i][j] = 0;
        }

        //left
        if((j-1)>=0 && vis[i][j]==0 && grid[i][j-1]==1){
            vis[i][j] = 1;
            ratmaze(i,j-1,st+"L",vis,grid,li,n);
            vis[i][j] = 0;
        }

        //right
        if((j+1)<n && vis[i][j]==0 && grid[i][j+1]==1){
            vis[i][j] = 1;
            ratmaze(i,j+1,st+"R",vis,grid,li,n);
            vis[i][j] = 0;
        }

        //upward
        if((i-1)<n && vis[i][j]==0 && grid[i-1][j]==1){
            vis[i][j] = 1;
            ratmaze(i-1,j,st+"U",vis,grid,li,n);
            vis[i][j] = 0;
        }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(grid[j][i])
        //     }
        // }
    }
}
