package Recursion;
import java.util.*;
public class powerofno {
    static long sum = 0;
    static long c = 1;
    static long r = 0;
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        System.out.println(solve(n));
        sc.close();
    }
    public static long solve(long n){
        long rs = (long)Math.pow(n,rev(n));
        System.out.println(rev(n));
        return rs;
    }
    public static long rev(long n){
        if(n==0){
            return 0;
        }
        if(n>0){
            System.out.println(sum);
            //long r = 
            r = n%10;
            c++;
            sum = sum*10 + r;
            rev(n/10);
            //return sum;
        }
        return sum;
    }
}
