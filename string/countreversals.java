package string;
import java.util.*;
public class countreversals {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        
        System.out.println(noofreversals(s));
        in.close();
    }
    public static  int noofreversals(String s){
        Stack<Character> q = new Stack<Character>();
        int c=0,c2=0;
        // if(s.length()%2==1)
        //     return -1;
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{'){
                q.add('{');
                c++;
            }else if( ch == '}'  && !q.isEmpty() && q.peek()=='{'){
                c--;
                q.pop();
                
            }else{
                q.add(ch);
                c2++;
            }
        }
        if(c%2 == 0){
            c = c/2;
        }
        else if(c%2 == 1){
            c = (c/2)+1;
        }
        if(c2 % 2 == 0){
            c2 = c2/2;
        }else if(c2%2 == 1){
            c2 = (c2/2)+1;
        }
        return c;
    }
}
