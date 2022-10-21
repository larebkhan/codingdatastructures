package Recursion;
import java.util.*;
public class PrintNbitbinarynumbershavingmore1sthan0sforanyprefix {
    static ArrayList<String> li = new ArrayList<>();      
    public static void main(String [] args){
        //li.clear();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
    public static ArrayList<String> solve(int n){
        li.clear();
        String op = "";
        int z = 0;
        int o = 0;
        solving(z,o,op,n); 
        Collections.sort(li); 
        return li;
    }
    public static void solving(int z,int o,String op,int n){
        if(n==0){
            li.add(op);
            return;
        }
        String op1 = op + "1";
        int o1 = o+1;
        int n1 = n-1;
        solving(z,o1,op1,n1);
        if(o>z){
            String op2 = op + "0";
            int z1 = z+1;
            int n2 = n-1;
            solving(z1,o,op2,n2);
        }
    }
}
