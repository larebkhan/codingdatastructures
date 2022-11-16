package Recursion;
import java.util.*;
public class pascalstriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pascals(n));
        sc.close();
    }
    public static ArrayList<Integer> pascals(int n){
        ArrayList<Integer> li = new ArrayList<>();
        int res = 1;
        //int up = n-1;
        li.add(1);
        for(int i=0;i<=n;i++){
            res *= (n-i);
            res /= i+1;
            li.add(res); 
        }
        return li;
    }
}
