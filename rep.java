
import java.util.Scanner;
public class rep {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(reep(n,arr));
    }
    public static int reep(int n , int []arr){
        int mins = n;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n;j++){
                if(arr[i]==arr[j]){
                    int s= j - i;
                    if(s<mins){
                        mins = s;
                    }
                } 
            }
        }
        return mins;
    }
}
