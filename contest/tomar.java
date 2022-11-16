package contest;
import java.util.*;
public class tomar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st = sc.nextLine();
        System.out.println(method(str,st));
        sc.close();
    }
    // static String leftrotate(StringBuilder str, int d)
    // {
    //         String ans = str.substring(d) + str.substring(0, d);
    //         return ans;
    // }
 
    // // function that rotates s towards right by d
    // static String rightrotate(StringBuilder sb, int d)
    // {
    //         return leftrotate(sb, sb.length() - d);
    // }
    // public static String  method(String str, String st){
    //     int d = st.charAt(1);
    //     char ch = st.charAt(0);
    //     String[] splitStringArray = str.split(" ");
    //     StringBuilder resultBuilder = new StringBuilder();
    //     for (String word : splitStringArray) {
    //         if (!word.equals(" ")) {
    //             StringBuilder sb = new StringBuilder(word);
    //             if(ch=='l'){
    //                 leftrotate(sb, d);
    //             }else{
    //                 rightrotate(sb,d);
    //             }
    //             resultBuilder.append(str + " ");
    //         }
    //     }
    //     return resultBuilder.toString();
    // }
    static String leftrotate(String str, int d)
    {
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
    static String rightrotate(String str, int d)
    {
            return leftrotate(str, str.length() - d);
    }
    public static String  method(String str, String st){
        String s = "";
        char a = st.charAt(1);
        int d = a -'0';

        String[] words = str.split("\\s+");
        System.out.println(st.charAt(1));
        //System.out.println(d);
        //System.out.println(d);
        //System.out.println(st);
        for (String word : words) {
            if(st.charAt(0)=='L'){
                word  = leftrotate(word,d);
                System.out.println(word);
            }else{
                word = rightrotate(word,d);
            }
            s = s + word+" ";
        }
        return s;
    }

}
