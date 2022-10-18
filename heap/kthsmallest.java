
import java.util.*;
public class kthsmallest {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(kth(arr,k));
        in.close();
    }
    public static int kth(int [] arr, int k){
        PriorityQueue<Integer> p= new PriorityQueue<Integer>(Collections.reverseOrder());
        int i=0;
        int n = arr.length;
        while(i<n){
            p.add(arr[i]);
            if(p.size()>k){
                p.remove();
            }
            i++;
        }
        return p.peek();
    }
    
}
