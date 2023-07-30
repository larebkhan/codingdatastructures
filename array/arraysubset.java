package array;
import java.util.*;
public class arraysubset {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        long a1[] = new long[n];
        long a2[] = new long[m];
        for(int i=0;i<n;i++){
            a1[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            a2[i]=in.nextInt();
        }
        System.out.println(isSubset(a1,a2,n,m));
        in.close();

    }

    public static String isSubset( long a1[], long a2[], long n, long m) {
        Set<Long> l = new HashSet<Long>();
        int count=0;
    for(int i=0;i<n;i++){
        l.add(a1[i]);
    }
    for(int i=0;i<m;i++){
        if(l.contains(a2[i])==true){
            count++;
        }
        
    }
    if(count==m){
        return "Yes";
    }else{
        return "No";
    }
}
    
}
