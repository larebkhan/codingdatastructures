
package array;
import java.util.*;

public class countnsay {
    public static String countndsay(int n){
        if(n==1)return "1";
        if(n==2)return "11";
        if(n==3)return "21";
        String ch = "21";
        ch = ch + "&";
        System.out.println(ch);
        for(int j = 4; j <= n; j++){
            String t = "";
            int c = 1;
            ch =ch + "&";
            for(int i = 1; i < ch.length(); i++){
                if(ch.charAt(i)!=ch.charAt(i-1)){
                    t = t + String.valueOf(c);
                    t = t + ch.charAt(i-1);
                    c = 1;
                }else {
                    c++;
                }
            
            }
            ch = t;
        }
        return ch;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countndsay(n));
        in.close();
    }
    
}
