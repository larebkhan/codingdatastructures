
package array;
import java.util.*;
import java.util.Arrays;
public class shufflestring {
    public static String sortingString(String r){
        char[] ch = r.toCharArray();
        Arrays.sort(ch);
        r = String.valueOf(ch);
        return r;

    }
    public static  boolean shuffleornot(String str1, String str2 , String result){
        str1 = sortingString(str1);
        str2 = sortingString(str2);
        result = sortingString(result);
        String str3 = str1 + str2;
        str3 = sortingString(str3);
        int i =0  , k = 0 ;
        while (k < result.length()){
            if(str3.charAt(i)==result.charAt(k) && str3.length() == result.length()){
                i++;
            }
            else {
                return false;
            }
            k++;
        }
        if(i != result.length() ){
            return false;
        }
        return true;


    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        String result = in.next();
            if(shuffleornot(str1,str2,result)== true){
                System.out.println(str1 + " and " + str2 + " combined together are a reshufling of "+ result);
            }
            else if(shuffleornot(str1,str2,result)== false){
                System.out.println(str1 + " and " + str2 + " combined together are NOT reshufling of "+ result);

            }
            in.close();
        }
    }
