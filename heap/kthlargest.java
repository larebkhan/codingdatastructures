
import java.util.*;
public class kthlargest {
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
    public static ArrayList<Integer> kth(int [] arr, int k){
        PriorityQueue<Integer> p= new PriorityQueue<Integer>();
        ArrayList<Integer> li = new ArrayList<>();
        int i=0;
        int n = arr.length;
        while(i<n){
            p.add(arr[i]);
            if(p.size()>k){
                p.remove();
            }
            i++;
        }
        while(p.size()>0){
            li.add(p.peek());
            p.remove();
        }
        return li;
    }
}
