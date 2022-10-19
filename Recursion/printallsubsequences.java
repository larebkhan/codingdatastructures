package Recursion;
import java.util.*;
public class printallsubsequences {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String op = " ";
        solve(ip,op);
        sc.close();
    }
    public static void solve(String ip , String op){
        // if(ip.isEmpty()){
        //     System.out.print(op);
        //     return;
        // }
        // ArrayList<Character> op1 = new ArrayList<>();
        // op.addAll(op1);
        
        // ArrayList<Character> op2 = new ArrayList<>();
        // op.addAll(op2);
        // op2.add(ip.get(0));
        // ip.remove(ip.get(0));
        // solve(ip, op1);
        // solve(ip,op2);
        
        if(ip==""){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op2 = op2 + ip.charAt(0);
        ip = ip.substring(1);
        solve(ip,op1);
        solve(ip,op2);
    }
}
