package array;
import java.util.*;
public class hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//array ka size batao
        int[] arr = new int[n];//intialize array
        //arr = [1,2,3,4]
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}
