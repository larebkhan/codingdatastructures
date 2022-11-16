package Recursion;
import java.util.*;
import java.util.ArrayList;
public class nqueen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solved(n));
        sc.close();
    }
    public static ArrayList<ArrayList<Integer>> solved(int n){
        ArrayList<ArrayList<String>> li1 = nqueenss(n);
        ArrayList<ArrayList<Integer>> cr = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<String> to: li1){
            //System.out.println();
            //cr1.clear();
            ArrayList<Integer> cr1 = new ArrayList<Integer>();
            for(String item : to){
                //System.out.println(item);
                for(int i=0;i<item.length();i++){
                    char ch = item.charAt(i);
                    if(ch=='Q'){
                        cr1.add(i+1);
                    }   
                }
                //System.out.println();
            }
            cr.add(cr1);
            //System.out.println(cr);
        }
        //System.out.println(li1);
        //Collections.sort(cr);
        // for(List<Integer> inner : cr){
        //     Collections.sort(inner);
        // }
        cr.sort((x, y) -> {
            for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                if (x.get(i) != y.get(i)) {
                    return x.get(i) - y.get(i);
                }
            }
            return x.size() - y.size();
        });
        return cr;
    }
    public static ArrayList<ArrayList<String>> nqueenss(int n){
        ArrayList<ArrayList<String>> li = new ArrayList<ArrayList<String>>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        //ArrayList<Integer> sli = new ArrayList<>();
        solve(0,li,n,board);
        return li;
    }
    public static boolean isSafe(int col,int row, char[][] board){
        int dupcol = col;
        int duprow = row;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row = duprow;
        col = dupcol;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        row = duprow;
        col = dupcol;
        while(row<board.length && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    public static void solve(int col ,ArrayList<ArrayList<String>> li, int n,char[][] board){
        if(col == n){
            li.add(construct(board));
            return;
        }
        for(int row =0; row<n;row++){
            if(isSafe(col,row,board)){
                board[row][col] = 'Q';
                solve(col+1,li,n,board);
                board[row][col] = '.';
            }
        }
    }
    public static ArrayList<String> construct(char[][] board){
        ArrayList<String> sli = new ArrayList<String>();
        for(int i = 0;i<board.length;i++){
            String s = new String(board[i]);
            sli.add(s);
        }
        return sli;
    }
}
