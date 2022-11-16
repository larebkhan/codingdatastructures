package Recursion;
import java.util.*;
class printpattern{
    static ArrayList<Integer> li = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(pattern(N));
        sc.close();
    }
    static List<Integer> pattern(int N){
        // code here
        li.clear();
        pat(li,N);
        // for(int i=0;i<li.size();i++){
        //     System.out.print(li.get(i)+ " ");
        // }
        return li;
        // return 
    }
    static void pat(ArrayList<Integer> li1,int N){
        if(N<=0){
            li1.add(N);
            return ;
        }
        li1.add(N);
        pat(li1,N-5);
        li1.add(N);
        li = li1;
    }
}
