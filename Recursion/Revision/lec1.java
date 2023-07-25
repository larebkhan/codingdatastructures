package Revision;

import java.util.*;
public class lec1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i< n;i++){
            arr[i] = sc.nextInt();
        }
        int num=sc.nextInt();
        System.out.println(prodofsubarr(n,arr,num));
        sc.close();
    }
    public static int prodofsubarr(int n , int[] arr , int num){
        
    }

}
