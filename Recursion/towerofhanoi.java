package Recursion;
import java.util.*;
public class towerofhanoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // int k = sc.nextInt();
        tower(N);
        sc.close();
    }
    public static void  tower(int N){
        int s=1;  
        int h=2;
        int d =3;
        System.out.println(solve(N,s,d,h)); 
        //System.out.println((int)Math.pow(2,N)-1);

    }
    public static int solve(int N, int s, int d, int h ){
        // int c=0;
        //c++;
        //System.out.println("TOTAL NO. OF STEPS NOW ARE"+ c);
        int count =1;
        if(N==1){
            System.out.println("moving disc "+N+" from rod "+ s+ " to rod "+d);
            return 0;
        }
        count += solve(N-1,s,h,d);//d
        System.out.println("moving disc "+N+" from rod "+ s+ " to rod "+d);
        count += solve(N-1,h,d,s);
        //System.out.println("no. of steps done till now are "+c);
        return count;  
    }
}
