package DynamicProgramming;
import java.util.*;
public class minimumswapstomakesubsequenceincreasing{
    static boolean scount ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n]; 
        int arr2[] = new int[n];
        //arr1[0]=-1;
        //arr2[0]=-1;
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        //int scount =0;
        System.out.println(solveRec(n,arr1,arr2,0,scount));
        sc.close();
    }
    public static int solveRec(int n, int[] arr1, int[] arr2,int index,boolean scount1){
        if(index==n){
            // scount = scount1;
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int prev1 = 0;
        int prev2=0;
        if(index!=0){
            prev1 = arr1[index-1];
            prev2 = arr2[index-1];
        }
        if(index==0){
            prev1 = -1;
            prev2=-1;
        }
        if(scount1){
            int temp = prev1;
            prev1 = prev2;
            prev2 = temp;
        }
        System.out.println(prev1 + "1st"+ prev2);
        if(arr1[index]>prev1&& arr2[index]>prev2){
            ans  = solveRec(n,arr1,arr2,index+1,false);
        }
        if (arr1[index]>prev2 && arr2[index]>prev1){ 
            System.out.println(ans);
            ans = Math.min(ans, 1+ solveRec(n,arr1,arr2,index+1,true)); 
        }
        return ans;
    }
}

