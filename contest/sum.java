package contest;
import java.util.*;
public class sum {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    char c[][] = new char[8][8];
    String[] s = new String[8];
    for(int i=0; i<T;i++){
        //for(int j=0;j<8;j++){
            for(int k=0;k<8;k++){
                s[k] = sc.next();
                c[k] = s[k].toCharArray();
                //c[j][k]= sc.next().charAt(0);
            //}
        }
         //System.out.println("HI");
        // System.out.println(c[4][5]);
        System.out.println(sums(c));
    }
    sc.close();
}
    public static String sums(char[][] c){
        for(int j=0;j<8;j++){
            int rr=0;
            int rb=0;
            for(int k=0;k<8;k++){
                if(c[j][k]=='.'){
                    break;
                }else if(c[j][k]=='R'){
                    rr++;
                }else if(c[j][k]=='B'){
                    rb++;
                }
            }
            if(rr==8){
                return "R";
            }else if(rb==8){
                return "B";
            }
        }
        for(int j=0;j<8;j++){
            int rr=0;
            int rb=0;
            for(int k=0;k<8;k++){
                if(c[k][j]=='.'){
                    break;
                }else if(c[k][j]=='R'){
                    rr++;
                }else if(c[k][j]=='B'){
                    rb++;
                }
            }
            if(rr==8){
                return "R";
            }else if(rb==8){
                return "B";
            }
        }
        return "Wrong";
    }
}
