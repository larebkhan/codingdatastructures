package Recursion;
import java.util.*;
public class kthsymbolingrammar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(symbol(n,k));
        sc.close();
    }
    
    public static int symbol(int n, int k){
        if(n==1 && k==1){
            return 0;
        }
        int mid = ((int)Math.pow(2,n-1))/2;
        if(k<=mid){
            return symbol(n-1,k);
        }else{
            if(symbol(n-1,k-mid)==0){
                return 1;
            }else{
                return 0;
            }
            //return symbol(n-1,k-mid);
        }
        
    }
}