package Recursion;
import java.util.*;
public class lettercasepermutation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(perm(s));
        sc.close();
    }
    public static ArrayList<String> perm(String s){
        ArrayList<String> ans = new ArrayList<>();
        String ip = s;
        String op = "";
        letterperm(ip,op,ans);
        return ans;
        //System.out.println(ans);
        
    }
    public static void letterperm(String ip, String op,ArrayList<String> ans){
        if(ip.length()==0){
            ans.add(op);
            return;
        }
        char c = ip.charAt(0);
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            String op1 = op;
            String op2 = op;
            op1 = op + Character.toUpperCase(ip.charAt(0));
            op2 = op + Character.toLowerCase(ip.charAt(0));
            ip = ip.substring(1);
            letterperm(ip, op1, ans);
            letterperm(ip, op2, ans);
        }else{
            String op1 = op;
            //char d = ip.charAt(0);
            op1 = op + ip.charAt(0);
            ip = ip.substring(1);
            letterperm(ip, op1, ans);
        }
    }
}
