import java.util.*;
class abc {
    static long maxProduct(int[] arr, int n) {
        if(arr.length==1)
            return arr[0];
        long p=1;
        long c=1;
        long maxa=0;
        long maxb=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                p=1;
                continue;
            }
            p*=arr[i];
            if(p>maxa){
                maxa=p;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0){
                c=1;
                continue;
            }
            c*=arr[i];
            if(c>maxb){
                maxb=c;
            }
        }
        return Math.max(maxa,maxb);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print(maxProduct(arr, n));
        in.close();
    }
}