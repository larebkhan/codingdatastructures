package Recursion;
import java.util.*;
public class permutationofagivenstring {
    static String ip = "";
    static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args){
        li.clear();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(solve(s,n));
        sc.close();
    }
    public static void swap(String ip1,int a , int b){
        //System.out.println(ip1+ "Original "+ a + b);
        char ch[] = ip1.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        ip1 = String.valueOf(ch);
        ip = ip1;
        //return ip1;
        //System.out.println(ip + "Swapped");
    }
    public static ArrayList<String> solve(String s,int n){
        //ArrayList<String> li = new ArrayList<>();
        ip = s;
        //int l =0;
        int r=n-1;
        solving(ip,0,r);
        return li;
    }
    public static void solving(String ip1,int l,int r){
        if(l==r){
            //System.out.println(ip);
            li.add(ip1);
            return;
        }else{
            for(int i=l;i<=r;i++){
                swap(ip1,l,i);
                ip1 = ip;
                //System.out.println("after swap"+ip1);
                solving(ip1,l+1,r);
                swap(ip1,l,i);
                ip1 = ip;
            }
        }
    }
}
