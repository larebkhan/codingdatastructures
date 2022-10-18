package string;
import java.util.*;
public class kmpalgo {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String p=in.nextLine();
        //String txt=in.nextLine();
        System.out.println(kmp(p));
        in.close();
    }
    public static int kmp(String p ){
        int [] lps = new int[p.length()];
        lps[0] = 0;
        int i=0,j=1;
        while(j<p.length()){
            if((p.charAt(i)!=p.charAt(j))){
                if(i==0){
                    lps[j] = 0;
                    j++;   
                }else{ 
                    i = lps[i-1];
                }
            }else if(p.charAt(i)==p.charAt(j)){
                lps[j] = i+1;
                i++;
                j++;
            }
        }
        // for(int q=0;q<lps.length;q++){
        //     System.out.print(lps[q]);
        // }
        return lps[lps.length-1];
        
        // i=0;j=0;
        // int n = txt.length();
        // int M = p.length();
        // while(i<n){
        //     if (p.charAt(j) == txt.charAt(i)) {
        //         j++;
        //         i++;
        //     }
        //     if (j == M) {
        //         System.out.println("Found pattern "
        //                            + "at index " + (i - j));
        //         j = lps[j - 1];
        //     }
        //     else if (p.charAt(j) != txt.charAt(i)){
        //         if (j != 0)
        //             j = lps[j - 1];
        //         else
        //             i = i + 1;
        //     }
        // }
        }

    }
