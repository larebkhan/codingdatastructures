package Recursion;
import java.util.*;
public class recursivelyremovingalladjacentduplicates {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
        sc.close();
    }
    public static String solve(String s){
        while(true){
        String temp = "";
        int i=0;
        int n = s.length();
        char ch[] = s.toCharArray();
        while(i<n){
            int j = i+1;
            while(j<n&&ch[i]==ch[j] ){
                j++;
                //System.out.println("hi"+i+j);
                
            }
            //System.out.println(" "+i+ " "+ j);
            if(i==(j-1)){
                //System.out.println("hi");
                temp += ch[i];
            }
            i=j;
        }
        if(s.length()==temp.length()){
            break;
        }
        s = temp;
    }
    return s;
    }
}
