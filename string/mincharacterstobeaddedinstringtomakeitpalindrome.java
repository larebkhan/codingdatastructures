package string;
import java.util.*;
public class mincharacterstobeaddedinstringtomakeitpalindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindromic(str));
        sc.close();
    }
    public static int palindromic(String str){
        char[] st = str.toCharArray();
       int n = str.length();
       int no = n-1;
       int t=0;
       if(n%2==0){
        t = str.length()/2;
       }else{
        t = (str.length()/2)+1;
       }
       System.out.println(t);
       for(int i=1;i<t;i++){
           if(st[i-1]==st[i+1]){
               int temp = n-1-(2*i);
               if(temp<no){
                   no=temp;
                   System.out.println(no);
               }
           }
       }
       return no;
    }
    
}
