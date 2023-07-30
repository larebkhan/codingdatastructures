package array;
import java.util.*;
public class splitbinary {
    public static int split(String str){
        int n = str.length();
        int c=0;
        int l=0;
        int ans=0;
        for(int i=0; i <n; i++){
            if(str.charAt(i) == '1')
                c++;
            if(str.charAt(i)== '0')
                l++;
            if(c==l){
                ans++;
                c=0;
                l=0;
            }
        }
        if(ans>0){
            return ans;
        }else {
            return -1;
        }


    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(split(s));
        in.close();
    }
    
}
