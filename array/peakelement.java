import java.util.*;
public class peakelement {
    public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(peek(n, arr));
        scan.close();
    }
    public static int peek(int n,int[] arr){
        for(int i=0; i< n;i++){
            if(i+1==n){
                continue;
            }
            else if(arr[i]<arr[i+1]){
                return i+1;
            }else{
                continue;
            }
        }
        return 0;
    }
}

