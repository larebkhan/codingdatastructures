package slidingvariable;
import java.util.*;
public class potd1 {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int k = in.nextInt();
        System.out.println(potd(s,k));
        in.close();
    }
    public static int potd(String s, int k){
        int i=0,j=0,c=0;
        HashMap<Character,Integer> h = new HashMap<>();
        int n= s.length();
        while(j<k){
            if(h.containsKey(s.charAt(j))){
                h.put(s.charAt(j), h.get(s.charAt(j))+1);
            }else{
                h.put(s.charAt(j), 1);
            }
            j++;
        }

        
        j=k-1;
        while(j<n-1){
            if(k==j-i+1){
                if(h.size()==k-1){
                    c++;
                }
                j++;
                if(h.containsKey(s.charAt(j))){
                h.put(s.charAt(j), h.get(s.charAt(j))+1);
                }else{
                    h.put(s.charAt(j), 1);
                }
                if(h.get(s.charAt(i))>1){
                    h.put(s.charAt(i),h.get(s.charAt(i))-1);
                }else{
                    h.remove(s.charAt(i));
                }
                i++;
                System.out.println(h);
            }
        }if(h.size()==k-1){
            c++;
        }
        return c;
    }
}
