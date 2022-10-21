package Recursion;
import java.util.*;
public class printallsubsequences {
    static ArrayList<String> ans = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        //String op = " ";
        System.out.println(AllPossibleStrings(ip));
        //System.out.println(ans);
        sc.close();
    }
    public static List<String> AllPossibleStrings(String s)
    {
        // Code here
        solve(s,"");
        Collections.sort(ans);
        return ans;
    }
    public static void solve(String ip , String op){
        if(ip==""){
            ans.add(op);
            return ;
        }
        String op1 = op;
        String op2 = op;
        op2 = op2 + ip.charAt(0);
        ip = ip.substring(1);
        solve(ip,op1);
        solve(ip,op2);
    }
}
