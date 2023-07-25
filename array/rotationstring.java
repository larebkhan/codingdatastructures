import java.util.*;
public class rotationstring {
    public static boolean areRotations(String str1,String str2){
        String temp = str1 + str1;
        if(temp.indexOf(str2)>=1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        System.out.println(areRotations(str1,str2));
        in.close();
    }
    
}
