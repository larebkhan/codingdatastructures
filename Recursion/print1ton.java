package Recursion;
import java.util.*;
public class print1ton {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printon(n,1);
    }
    public static void printon(int n,int k){
        if(n==k)return ;
        else{
            System.out.println(k);
            printon(n,k+1);
        }

    }
}
