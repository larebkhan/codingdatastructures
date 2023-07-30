package array;
import java.util.*;
public class longpalin {
    //static String maxString = "";
    //static int maxlen = 0;
    public static String revString(String ss){
        String temp = "";
        int si = ss.length();
        for(int i= si-1 ; i >=0;i--){
            temp = temp + ss.charAt(i);
        }
        //System.out.println(temp);
        return temp;
    }
    public static String longestpalin(String s){
        int n = s.length();
        String maxString = "";
        int maxlen = 0;
        for (int i = 0; i < n; i++){
           for (int j = i+1; j <= n; j++){
            String temp = s.substring(i,j);
            //System.out.println("hey");
            if(revString(temp).equals(temp)){
                int c = temp.length();
                //System.out.println(temp);
                if(c>maxlen){
                    maxlen = c;
                    maxString = temp;
                    //System.out.println("hey");
                }
            }       
        }
    }
    return maxString;
}
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(longestpalin(s));
        in.close();
    }
}
