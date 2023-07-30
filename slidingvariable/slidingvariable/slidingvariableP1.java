package slidingvariable;
import java.util.*;
public class slidingvariableP1 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(largmaxsum(n,arr,k));
        in.close();
    }
    public static int largmaxsum(int n, int[] arr, int k){
        int i=0,j=0,sum=0,maxr=0;
        while(j<n){
            sum+= arr[j];
            if(sum<k){
                j++;
            }else if(sum==k){
                /*if((j-i+1)>maxr){
                    maxr=j-i+1;
                }*/
                maxr = Math.max(maxr, j-i+1);
                j++;
            }else if(sum>k){
                while(sum>k){
                    sum = sum - arr[i];
                    i++;
                }
                if(sum==k){
                    /*if((j-i+1)>maxr){
                        maxr=j-i+1;
                    }*/
                    maxr = Math.max(maxr, j-i+1);
                }
                j++;
            }
        }
        return maxr;

    } 
}

