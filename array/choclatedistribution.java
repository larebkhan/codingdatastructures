
package array;
import java.util.*;

public class choclatedistribution {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long n=in.nextInt();
        
        ArrayList<Long> a = new ArrayList<Long>();
        for(long i=0;i<n;i++){
            long s = in.nextInt();
            a.add(s);
        }
        long m=in.nextInt();
        System.out.println(findMinDiff(a , n ,m));
        in.close();
    }
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long minans = Integer.MAX_VALUE;
        for(long i=0;i<n-m+1;i++){
            if((a.get((int) (m-1)+(int)i)-a.get((int)i)<minans))
            minans = a.get((int) (m-1)+(int) i)-a.get((int)i);
        }
        return minans;
    } 

    
}