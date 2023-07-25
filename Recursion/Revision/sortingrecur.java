package Recursion.Revision;

import java.util.Scanner;

public class sortingrecur {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i< n;i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println(arr.length);
        sortin(arr,n);
    }
    public static void sortin(int[] arr, int n){
        
        if(arr.length==1)return;
        else{
            int k =0 ;
            int[] arrn = new int[arr.length-1];
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr.length){
                    arrn[k]=arr[i];
                    k++;
                }else {
                    arrn[k] = arr[arr.length];
                }
            }
            sortin(arrn,n-1);
        }
        
        for(int i = 0 ; i<n;i++){
            System.out.println(arrn[i]);
        }
    }
}
