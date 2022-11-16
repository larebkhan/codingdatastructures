package Recursion;

import java.util.*;
public class luckyno {
    static int c = 2;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lucky(n,c));
        sc.close();
    }
    public static boolean lucky(int n,int c){
        if(n<c){
            return true;
        }if(n%c==0){
            return false;
        }
        int np = n;
        np = np - (np/c);
        c++;
        return lucky(np,c);
    }
}
