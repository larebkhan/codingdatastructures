package Recursion;
import java.util.*;
public class sortastack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] arr = new int[n];
        Stack<Integer> li = new Stack<>();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
            //li.add(arr[i]);
        }
        sorted(li);
        System.out.println(li);
        sc.close();
    }
    public static void  sorted(Stack<Integer> li){
        //ArrayList<Integer> li = new ArrayList<>();
        if(li.size()==1){
            return ;
        }
        int temp = li.peek();
        li.pop();
        sorted(li);
        insert(li,temp);


    }
    public static void insert(Stack<Integer> li,int temp){
        if(li.isEmpty() || li.peek()<=temp){
            li.add(temp);
            return ;
        }
        int t = li.peek();
        li.pop();
        insert(li,temp);
        li.add(t);
        return;

    }

}