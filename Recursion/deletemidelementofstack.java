package Recursion;
import java.util.*;
public class deletemidelementofstack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] arr = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
            //li.add(arr[i]);
        }
        int k = (n/2)+1;
        solve(s, k);
        System.out.println(s);
        sc.close();
    }
    public static void solve(Stack<Integer> s,int k){
        if(k==1){
            System.out.println(s.pop());
            return ;
        }
        int temp = s.peek();
        s.pop();
        solve(s,k-1);
        s.add(temp);
        return;
    }
}