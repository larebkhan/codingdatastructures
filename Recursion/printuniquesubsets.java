package Recursion;
import java.util.*; 
public class printuniquesubsets {  
    static HashMap<String,Integer> h = new HashMap<>();

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s=sc.next();
        solve(s,"");
        System.out.println(h.keySet());
        sc.close();
    }
    public static void solve(String ip,String op){
        if(ip==""){
            if(h.containsKey(op)){
                return ;
            }
            h.put(op,1);
            return;
        }
        String op1 = op;
        String op2 = op;
        //System.out.println(ip);
        op2 = op2 + ip.charAt(0);
        String ip1 = ip.substring(1);
        solve(ip1,op1);
        solve(ip1,op2);

    }
}
