package string;
import java.util.*;
public class firstoccurenceofword {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(occur(str));
        sc.close();
    }
    public static String occur(String str){
        String[] words = str.split("\\s");
        HashSet<String> h = new HashSet<>();
        for(String w:words){
            //System.out.println(w);
            if(h.contains(w)){
                //System.out.println(w);
                return w;
            }else{
                h.add(w);
            }
        }
        //System.out.println(h);
        return " ";
    }
}
