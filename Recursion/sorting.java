package Recursion;
import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] arr = new int[n];
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
            //li.add(arr[i]);
        }
        sorted(li);
        System.out.println(li);
        sc.close();
    }
    public static void  sorted(ArrayList<Integer> li){
        //ArrayList<Integer> li = new ArrayList<>();
        if(li.size()==1){
            return ;
        }
        int temp = li.get(li.size()-1);
        li.remove(li.size()-1);
        sorted(li);
        insert(li,temp);


    }
    public static void insert(ArrayList<Integer> li,int temp){
        if(li.size()==0  || li.get(li.size()-1)<=temp){//as the second codition is necessary to insert anything in the list
            System.out.println(temp);
            li.add(temp);

            return ;
        }
        int t = li.get(li.size()-1);
        li.remove(li.size()-1);
        insert(li,temp);
        System.out.println(t);
        li.add(t);
        return;

    }

}
