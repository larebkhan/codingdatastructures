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
/* package Recursion;
import java.util.*;
public class PrintNbitbinarynumbershavingmore1sthan0sforanyprefix {
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int on = 0;
    int ze =0;
    solve(n,"",on,ze);
    System.out.println(li);
    sc.close();
    }
public static void solve(int n, String op, int on, int ze){
    if(n==0){
        li.add(op);
        return;
    }
    String op1 = op +"1";
    String op2 = op + "0";
    int n1 = n;
    int on1 = on;
    int ze1 = ze;
    if(on==ze){
        String op1 = op + "1";
        int on1 = on+1;
        int ze1 = ze;
        int n1 = n;
        //String ip1 = ip.substring(0,ip.length()-1);
        solve(n1-1,op1,on1,ze1);
    }
    if(on>ze){
        String op1 = op +"1";
        String op2 = op + "0";
        int n1 = n;
        int on1 = on;
        int ze1 = ze;
        //String ip1 = ip.substring(0,ip.length()-1);
        solve(n1-1,op1,on1+1,ze1);
        solve(n1-1,op2,on1,ze1+1);
        }
    }
} */
