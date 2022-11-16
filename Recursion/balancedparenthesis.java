package Recursion;
import java.util.*;
public class balancedparenthesis {
    static ArrayList<String> li = new ArrayList<>();      
    public static void main(String [] args){
        //li.clear();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(balanced(n));
        sc.close();
    }
    public static ArrayList<String> balanced(int n){
        li.clear();
        String op = "";
        int o = n;
        int c = n;
        balancing(o,c,op); 
        Collections.sort(li); 
        return li;
    }
    public static void balancing(int o,int c, String op){
        if(o==0 && c==0){
            li.add(op);
            return;
        }
        if(o!=0){
            String op1 = op + "(";
            int o1 = o-1;
            balancing(o1,c,op1);
        }
        if(c>o){
            String op2 = op + ")";
            int c2 = c-1;
            balancing(o,c2,op2);
        }
        return;
    }
}
        // if(o<c && o!=0){
        //     String op1 = op + "(";
        //     String op2 = op + ")";
        //     int o1 = o-1;
        //     //System.out.println(o1);
        //     int c2 = c-1;
        //     balancing(o1,c,op1);
        //     balancing(o,c2,op2);
        // }else if(o==c && o!=0 ){
        //     String op1 = op + "(";
        //     int o1 = o-1;
        //     balancing(o1,c,op1);
        // }
        
