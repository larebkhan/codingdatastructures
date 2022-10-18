package string;
import java.util.*;
public class wildcardstringmatching {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String sw=in.next();
        String sp=in.next();
        System.out.println(wildcard(sw, sp));
        in.close();
    }
    public static boolean wildcard(String sw, String sp ){
        int j =0, i=0;
        int n = sp.length();
        int m = sw.length();
        while(j<m && i<n){
            char cp = sp.charAt(i);
            char cw = sw.charAt(j);
            if(cp!= cw){
                if(cw == '?'){
                    if(sp.charAt(i+1)==sw.charAt(j+1)){
                        i++;
                        j++;
                    }else{
                        System.out.println("hey1");
                        return false;
                    }
                }else if(cw=='*'){
                    int count=0;
                    while(sp.charAt(i+1)!=cw && m>i+1){
                        i++;
                        count++;
                        System.out.println("end");
                    }
                    if(count == (m-(i+1)+1)){
                        System.out.println(cw);
                        System.out.println(cp);
                        System.out.println("hey2");
                        return false;
                    }
                }else{
                    System.out.println(cw);
                    System.out.println(cp);
                    System.out.println("hey3");
                    return false;
                }
            }else if(cp == cw){
                i++;
                j++;
            }
        }
        System.out.print("end");
        return true;
    }
}
