package array;
import java.util.*;
public class anagramsoccur {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s=in.next();
        String sb=in.next();
        System.out.println(anagram(s,sb));
        in.close();
    }
    public static int anagram(String s,String sb){
        int j=0,i=0,count=0;
        int k = s.length();                           //length of small string 
        Map<Character, Integer> mp = new HashMap<>(); //for putting the chars of small string(the anagram)
        Map<Character, Integer> mp1 = new HashMap<>();//for outting the chars of window that is to be compared to chech anagram
        for(int l=0;l<k;l++){                         //loop to store the anagram in mp                       
            char ch=s.charAt(l);
            if(mp.containsKey(ch))
                mp.put(ch,mp.get(ch)+1);
            else
                mp.put(ch,1);
        }
        while(j<k){                                   //loop to stroe the first window of big string
            char ch=sb.charAt(j);
            if(mp1.containsKey(ch))
                mp1.put(ch,mp1.get(ch)+1);
            else
                mp1.put(ch,1);
            j++;
        }
        while(j<sb.length()){                         //loop to slide the window after checking if both maps are equal
            if(mp.equals(mp1))                        
                count++;
            char ch=sb.charAt(j);
            if(mp1.containsKey(ch))                   //to add jth element to mp1
                mp1.put(ch,mp1.get(ch)+1);
            else
                mp1.put(ch,1);
            char ch1=sb.charAt(i);
            if(mp1.get(ch1)==1)                       //to remove the ith element from mp1
                mp1.remove(ch1);
            else
                mp1.put(ch1, mp1.get(ch1)-1);
            i++;                                      //sliding the window
            j++;
        }
        if(mp.equals(mp1))                        
        count++;
        return count;

    }
}
