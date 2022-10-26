package Recursion;
import java.util.*;
public class combinationsum {
    static ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>(); 
    static ArrayList<Integer> lii = new ArrayList<>();
    static ArrayList<Integer> lii2 = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(solve(N,arr,B));
        sc.close();
    }
    public static int removeDuplicates(int arr[], int n)
	{
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}
    public static ArrayList<ArrayList<Integer>> solve(int N, int[] arr, int B){
        int l=0;
        Arrays.sort(arr);
        int n = removeDuplicates(arr,N);
        solving(arr,lii,n,l, B);
        return li;
    }
    public static void solving(int[]arr,ArrayList<Integer> lii1,int n,int l,int B1 ){
        if(B1==0){
            lii2 = new ArrayList<Integer>(lii);
            System.out.println(lii2);
            li.add(lii2);
            return;
        }
        for(int i=l;i<n;i++){
            if(B1-arr[i]>=0){
                lii1.add(arr[i]);
                //System.out.println(lii1);
                solving(arr,lii1,n,i,B1-arr[i]);
                //System.out.println(li);
                lii1.remove(lii1.size()-1);
            }
        }
    }
}
