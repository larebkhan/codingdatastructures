package string;
import java.util.*;
public class isomorphic {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        System.out.println(isomorphic1(s1,s2));
        in.close();
    }
    public static ArrayList<Integer> isomorphic1(String s1, String s2){
        ArrayList<Integer> li = new ArrayList<>();
        //ArrayList<Integer> lii = new ArrayList<>();
        int i=0,j=1;
        int c=1;
        for(; j< s1.length();i++){
            if(s1.charAt(i)==s1.charAt(j)){
                c++;
                j++;
            }else{
                li.add(c);
                i = j;
                j++;
                c=1;
            }
        }
        // if(i==s1.length()){
        //     li.add(1);
        // }
        return li;
    }
}
