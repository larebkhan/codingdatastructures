package Recursion;
import java.util.*;
public class permutationwithspaces {
    // 
    static ArrayList<String> ans = new ArrayList<>();
    ArrayList<String> permutation(String s){
        // Code Here
        String ip= s.substring(1);
        String op = s.substring(0,1);
        permutation(ip,op);
        Collections.sort(ans);
        return ans;
    }
    public static void permutation(String ip,String op){
    if(ip==""){
            ans.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op1 = op+ ip.charAt(0);
        op2 = op + " "+ ip.charAt(0);
        ip = ip.substring(1);
        permutation(ip,op1);
        permutation(ip,op2);
    }

    }
