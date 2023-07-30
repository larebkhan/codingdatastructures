package array;
import java.util.*;
public class specialkeyboard {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
    public static int solve(int n){
        if(n<6)
        return n;
        int t = (n/3)+1;
        int mul = t*(n-(t+2))+t;
        return mul;




    }
}
