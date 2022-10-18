package string;
import java.util.*;
public class tranformstring {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(transform(s));
        in.close();
    }
    public static HashMap<Character, Integer> transform(String s){
        HashMap<Character, Integer> h = new HashMap<>();
        int n = s.length();
        for(int i =0;i<n;i++){
            char c= s.charAt(i);
            h.put(c, h.getOrDefault(c, 0)+1);
        }
        return h;
    }
}
