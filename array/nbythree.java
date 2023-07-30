
package array;
import java.util.*;
class nbythree{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print(nthree(arr,n));
        in.close();

    }
    public static List<Integer> nthree(int []arr,int n){
        List <Integer> li =new ArrayList<>();
        if(n==2){
            li.add(arr[0]);
            li.add(arr[1]);
            return li;
        }
        int c=1;
        int count=0;
        int ansind =0;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[ansind]){
                c++;
            }else{
                c--;
            }if(c==0){
                c=1;
                ansind = i;
            }

        }
        for(int i=0;i<n;i++){
            if(arr[ansind]==arr[i]){
                count++;
            }
        }
        if(count>(n/3)){

            li.add(arr[ansind]);
        }
        if(n>3){
        int c1=1;
        int count1=0;
        int ansind1=0;
        int d = arr[ansind];
        for(int i=1;i<n;i++){
            if(arr[i]==d)
            continue;
            if(arr[i]==arr[ansind1]){

                c1++;
            }else{
                c1--;
            }if(c1==0){
                c1=1;
                ansind = i;
            }

        }
        for(int i=0;i<n;i++){
            if(arr[ansind1]==arr[i]){
                count1++;
            }
        }
        if(count1>(n/3)){

            li.add(arr[ansind1]);
        }
        

    }
    return li;
}
}
