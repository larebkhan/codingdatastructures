
import java.util.*;
public class buysellstock2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(maxProfit(arr,n));
        in.close();

    }
    public static int maxProfit(int[] arr,int n) {
        int maxp = 0;
        int min=arr[0];
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<n;i++){
            /*if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }*/
            if(min<arr[i]){
                if(maxp<(arr[i]-min)){
                    maxp=arr[i]-min;
                    li.add(maxp);
                }
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int z = li.size();
        int mp=0;
        int ind =0;
        for(int i=0;i<z;i++){
            if(li.get(i)>mp){
                mp=li.get(i);
                ind = i;
            }
        }
        li.remove(ind);
        int f= li.size();
        int ms=0;
        for(int i=0;i<f;i++){
            if(li.get(i)>ms){
                ms=li.get(i);
            }
        }
        return ((mp+ms));
        
    }
    
}
