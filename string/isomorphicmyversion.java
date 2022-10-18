package string;
import java.util.*;
public class isomorphicmyversion {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        System.out.println(isomorphic1(s1,s2));
        in.close();
    }
    public static boolean isomorphic1(String s1, String s2){
        HashMap<Character, Integer> h = new HashMap<>();
        HashMap<Character, Integer> h1 = new HashMap<>();
        for(int i=0; i< s1.length(); i++){
            if(h.containsKey(s1.charAt(i))){
                h.put(s1.charAt(i),h.get(s1.charAt(i))+1);
            }else{
                h.put(s1.charAt(i),1);
            }
        }
        for(int i=0; i< s2.length(); i++){
            if(h1.containsKey(s2.charAt(i))){
                h1.put(s2.charAt(i),h1.get(s2.charAt(i))+1);
            }else{
                h1.put(s2.charAt(i),1);
            }
        }
        if(h.size()==h1.size()){
            return true;
        }else{
            return false;
        }
    }
}
