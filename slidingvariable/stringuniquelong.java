package slidingvariable;
import java.util.*;
public class stringuniquelong {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(unqlong(s));
        in.close();
    }
    public static int unqlong(String s){
        HashMap<Character,Integer> h = new HashMap<>();
        int i=0,j=0,ans=0,maxans=0;
        int n = s.length();
        while(j<n){
            /*if(h.containsKey(s.charAt(j))){
                h.put(s.charAt(j), h.get(s.charAt(j))+1);
                while(s.charAt(i)!=s.charAt(j)){
                    i++;
                }
            }else{
                h.put(s.charAt(j),1);
                if(h.size()==(j-i+1)){
                    ans = j-i+1;
                    if(ans>maxans){
                        maxans = ans;
                    }
                }else{
                    if(h.get(s.charAt(i))>1){
                        h.put(s.charAt(i), h.get(s.charAt(i))-1);
                    }else{
                        h.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
            
        }*/
        if(h.containsKey(s.charAt(j))){
            h.put(s.charAt(j), h.get(s.charAt(j))+1);
        }else{
            h.put(s.charAt(j),1);
        }
        if(h.size()==(j-i+1)){
            ans = j-i+1;
            if(ans>maxans){
                maxans= ans;
            }
            j++;
        }else if(h.size()<(j-i+1)){
            while((h.size()<(j-i+1))){
                if((h.get(s.charAt(i)))>1){
                    h.put(s.charAt(i), h.get(s.charAt(i))-1);
                }else{
                    h.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
    }
    
    return maxans;
}
}
