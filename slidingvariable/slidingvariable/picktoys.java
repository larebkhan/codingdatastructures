package slidingvariable;
import java.util.*;
public class picktoys {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(toys(s));
        in.close();
    }
    public static int toys(String s){
        int i=0,j=0,ans=0,maxans=0;
        int n= s.length();
        HashMap<Character,Integer> h = new HashMap<>();
        while(j<n){
            if(h.containsKey(s.charAt(j))){
                h.put(s.charAt(j), h.get(s.charAt(j))+1);
            }else{
                h.put(s.charAt(j),1);
            }
            if(h.size()<2){
                j++;
                ans++;
            }else if(h.size()>2){
                while(h.size()>2){
                    if((h.get(s.charAt(i)))>1){
                        h.put(s.charAt(i), h.get(s.charAt(i))-1);
                    }else{
                        h.remove(s.charAt(i));
                    }
                    i++;
                    ans--;
                }
                j++;
                ans++;
            }else if(h.size()==2){
                ans++;
                if(ans>maxans){
                    maxans=ans;
                }
                j++;
            }
        }
        return maxans;
    }
}
