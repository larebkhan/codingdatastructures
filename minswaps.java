import java.util.*;
public class minswaps {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(miniswaps(arr,n,k));
        in.close();
    }
    public static int miniswaps(int[] arr , int n,int k){
        int minind=0;
        int flag=0;
        int z =0;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                i++;
                continue;
            }else if(arr[i]<=k){
                if(flag>0){
                    z = minind+1;
                    int temp = arr[z];
                    arr[z] = arr[i];
                    arr[i] = temp;
                    minind++;
                    count++;
                }else{
                    minind = i;
                }
            }
        }
        return count;

    }
    
}
