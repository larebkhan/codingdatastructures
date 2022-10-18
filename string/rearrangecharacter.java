package string;
import java.util.*;
public class rearrangecharacter {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(rearrange(s));
        in.close();
    }
    // public static  int frequency(Char a){
    //     for(int i=0; i<s.length();i++){
    //         if()
    //     }
    // }
    // public static  int rearrange(String s){
    //     HashMap<Character , Integer> h = new HashMap<>();
    //     int [] arr = new int[s.length()];
    //     for(int i=0; i<s.length();i++){
    //         if(h.containsKey(s.charAt(i))){
    //             h.put(s.charAt(i), h.get(s.charAt(i))+1);
    //         }else{
    //             h.put(s.charAt(i), 1);
    //         }
    //     }
    // }
    public static String rearrange(String str) {
	
		//code here
		HashMap<Character, Integer> mp = new HashMap<>();
	    char max_char = str.charAt(0);
	    int n = str.length();
	    for(int i = 0;i<n;i++){
	        char c = str.charAt(i);
	        mp.put(c,mp.getOrDefault(c,0)+1);
	        if(mp.get(c)>=mp.get(max_char)){
	            max_char = c;
	        }
	    }	    
	    if(mp.get(max_char)>(n+1)/2){
	        return "-1";
	    }
        int idx=0;
        char[] ans = new char[n];
        while(mp.get(max_char)>0){
            ans[idx] = max_char;
            mp.put(max_char,mp.get(max_char)-1);
            idx = idx+2;
        }
        for(char c: mp.keySet()){
            int cnt = mp.get(c);
            while(cnt>0){
            idx = idx>=n?1:idx;
            ans[idx] = c;
            idx = idx+2;
            cnt--;
        }
        }
        return String.valueOf(ans);
	}
}
