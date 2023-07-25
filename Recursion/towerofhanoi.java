package Recursion;
import java.util.*;
public class towerofhanoi {
    static int count = 0; //this is compulsory as static reference of global variable is required to access it in recursive funtions ; removing it will give you an error that count cannot be recognised
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
        //int count =0;
        System.out.println(solve(N,s,d,h,count)); 
        //System.out.println((int)Math.pow(2,N)-1);

    }
    public static int solve(int N, int s, int d, int h ,int count1){
        // int c=0;
        count = count1;//primitive datatypes cannot be statically declared at the main function so everytime its reference has to be declared to the static global variable (which is defined in the main function)
        count++;       //matlab ki tum count ko aisa nai kar skte ki main mei deine krdo fir wo har function mei apne ap bina reset hue value badhata 
        //rahe har barr wo reset ho jayega to isko overcome krne k liye tumhe global wale count ko function k refernce ki value deni hogi yani ki
        //count1 ki jo ki pichle recursive call se bina reset hui value leke ara hai ;; ab scene ye hai ki ye count1 ka scope locally defoined hai 
        //toh ye agey nai le ja skta value iske liye global wale count ki zarurat hai tnbhi count = count1 kr rae hai.
    
        //System.out.println("TOTAL NO. OF STEPS NOW ARE"+ c);
        //int count =1;
        if(N==1){
            System.out.println("moving disc "+N+" from rod "+ s+ " to rod "+d);
            return 0;
        }
        solve(N-1,s,h,d,count);//d
        System.out.println("moving disc "+N+" from rod "+ s+ " to rod "+d);
        solve(N-1,h,d,s,count);
        //System.out.println("no. of steps done till now are "+c);
        return count;  
    }
}
