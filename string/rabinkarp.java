package string;
import java.util.*;
public class rabinkarp {
    public final static int d = 10;
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int q =13;
        String s=in.nextLine();
        String sb=in.nextLine();
        rabin(s,sb,q);
        in.close();
    }
    public static void rabin(String s, String sb ,int q){
    //     double hm=1, hb=1;
    //     int i=0,j=0,c=0, n= sb.length();
    //     int k=s.length();
    //     // HashMap<Character, Integer> h = new HashMap<>();
    //     // int hm=0;
    //     // for(int i=0; i < s.length();i++){
    //     //     if(h.containsKey(s.charAt(i))){
    //     //         h.put(s.charAt(i), h.get(s.charAt(i))+1);
    //     //     }else{
    //     //         h.put(s.charAt(i),1);
    //     //     }
    //     // }
    //     // for(int i =0; i<h.size();i++){
    //     //     hm = hm + 
    //     // } 
    //     for(int x=0; x <s.length();x++){
    //         int m = s.length()-1;
    //         hm = hm +  s.charAt(x)*(Math.pow(10,m)); 
    //         System.out.println(hm);
    //         m = m-1;
    //     }
    //     for(int x=0; x < s.length();x++){
    //         int m = s.length()-1;
    //         hb = hb +  sb.charAt(x)*(Math.pow(10,m));
    //         m = m-1;
    //     }
    //     System.out.println(hm);
    //     System.out.println(hb);
    //     j = s.length()-1;
    //     while(j<n){
    //         if(hm == hb){
    //             for(int x=0; x < s.length();x++){
    //                 if(Character.compare(s.charAt(x), sb.charAt(x))==0){
    //                     c++;
    //                 }
    //             }
    //             if(c==s.length()-1){
    //                 System.out.println("Pattern is at index");
    //             }
    //             j++;
    //             hb = ((hb-(sb.charAt(i)*(Math.pow(10,k-1))))*10) + (sb.charAt(j)*(Math.pow(10,0)));
    //             i++;
    //         }else{
    //             j++;
    //             hb = ((hb-(sb.charAt(i)*(Math.pow(10,k-1))))*10) + (sb.charAt(j)*(Math.pow(10,0)));
    //             System.out.println(hb);
    //             i++;
    //         }
    //     }
        

    // }
    int m = s.length();
    int n = sb.length();
    int i, j;
    int p = 0;
    int t = 0;
    int h = 1;

    for (i = 0; i < m - 1; i++)
      h = (h * d) % q;
      System.out.println(h);

    // Calculate hash value for pattern and text
    for (i = 0; i < m; i++) {
      p = (d * p + s.charAt(i)) % q;
      t = (d * t + sb.charAt(i)) % q;
    //   System.out.println(p);
    //   System.out.println(t);
    //   System.out.println(".");


    }

    // Find the match
    for (i = 0; i <= n - m; i++) {
      if (p == t) {
        for (j = 0; j < m; j++) {
          if (sb.charAt(i + j) != s.charAt(j))
            break;
        }

        if (j == m)
          System.out.println("Pattern is found at position: " + (i + 1));
      }

      if (i < n - m) {
        t = (d * (t - sb.charAt(i) * h) + sb.charAt(i + m)) % q;
        if (t < 0)
          t = (t + q);
      }
}
    }
}
