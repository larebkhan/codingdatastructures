package array;
import java.util.*;
public class fikneg{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        fneg(n,arr,k);
        in.close();
    }
    public static void fneg(int n , int arr[] , int k){
        int j=0,i=0;
        ArrayList<Integer> li = new ArrayList<Integer>();
        while(j<n){
            if((j-i+1)<k){
                if(arr[j]<0){
                    li.add(arr[j]);
                }
                j++;
            }else if((j-i+1)==k){
                if(li.isEmpty()){
                    System.out.println(0);
                    j++;
                }
                else{System.out.println(li.get(0));
                if(arr[i]<0){
                    li.remove(0);
                }
                i++;
                j++;
                if(j==n)
                    break;
                if(arr[j]<0){
                    li.add(arr[j]);
                }
                if(j==n){
                    System.out.println(li.get(0));
                }
                }
            }
        }
    } 
}
