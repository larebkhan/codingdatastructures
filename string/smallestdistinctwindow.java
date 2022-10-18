package string;
import java.util.*;
public class smallestdistinctwindow {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(distinctwindow(s));
        in.close();
    }
    public static int distinctwindow(String s){
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(int i=0; i< s.length();i++){
            if(h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i), h1.get(s.charAt(i))+1);
            }else{
                h1.put(s.charAt(i), 1);
            }
        }
        int n = s.length();
        int i=0,j=0;
        int minans=Integer.MAX_VALUE, ans=0;
        while(j<n){
            if(h1.containsKey(s.charAt(j))){
                if(h2.containsKey(s.charAt(j))){
                    h2.put(s.charAt(j), h2.get(s.charAt(j))+1);
                }else{
                    h2.put(s.charAt(j), 1);
                }
            }
            if(h1.size()==h2.size()){
                ans = j-i+1;
                if(ans<minans){
                    minans = ans;
                }
                //System.out.println(h2);
                while(h2.size()==h1.size()){
                    if((h2.get(s.charAt(i)))>1){
                        h2.put(s.charAt(i), h2.get(s.charAt(i))-1);
                    }else{
                        h2.remove(s.charAt(i));
                    }
                    i++;
                    if(h2.size()==h1.size()){
                        ans = j-i+1;
                        if(ans<minans){
                            minans = ans;
                        }
                    }
                } 
                j++;
            }else if(h1.size()>h2.size()){
                j++;
            }
        }
        // System.out.println(h2);
        return minans;
    }
}
