import java.util.*;
class Pair{
    int a ,b;
    Pair(int a, int b){
        this.a = a;
        this.b =b;
    }
}
public class kclosestno {
    public static void main(String args[]){
        // Scanner in=new Scanner(System.in);
        // int x=in.nextInt();
        // int n=in.nextInt();
        // int k=in.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=in.nextInt();
        // }
        PriorityQueue <Pair> pq = new PriorityQueue <Pair>(Collections.reverseOrder((x,y)->x.a-y.a));
        pq.add(new Pair(7,8));
        pq.add(new Pair(3,4));

        Pair p = pq.peek();
        System.out.println(p.a);
        //System.out.println(k(arr,k,x,n));
        //in.close();
    }
}
    /*public static void k(int[] arr, int k, int x,int n){

        PriorityQueue <Pair> pq = new PriorityQueue <Pair>(Collections.reverseOrder());
        pq.add(new Pair(7,8));
        Pair p = pq.peek();
        System.out.println(p.a);
        ArrayList<Integer> li = new ArrayList<>();
        //for(int i=0;i<n;i++){
            //int temp = Math.abs(arr[i]-x);
            //pq.add(8,8);
            //if(pq.size()>k){

            }
        }*/
