package Recursion;
import java.util.*;
public class combinations {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> result=combinationUtil(n,k);
        System.out.println(result);
        sc.close();
    }
    public static List<List<Integer>> combinationUtil(int n, int k){
        
    }
}
