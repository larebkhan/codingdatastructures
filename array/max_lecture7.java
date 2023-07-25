import java.util.*;
import java.util.ArrayList;
public class max_lecture7 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(max_sum(n,arr,k));
        in.close();
    }
    public static List<Integer> max_sum(int n, int[] arr, int k){
        int i = 0 ,j=0;
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while(j<n){
            while(li.size()>0 && (li.get(li.size() - 1))<arr[j])
               li.remove(li.get(li.size() - 1));
            li.add(arr[j]);
            if((j-i+1)==k){
                ans.add(li.get(0));
                if(li.get(0)==arr[i]){
                    li.remove(li.get(0));
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
