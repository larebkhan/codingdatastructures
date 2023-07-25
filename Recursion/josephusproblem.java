package Recursion;
import java.util.*;
public class josephusproblem {
    static int ans =0;
    //static ArrayList<String> li = new ArrayList<>();      
    public static void main(String [] args){
        //li.clear();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(n,k));
        sc.close();
    }
    public static int solve(int n,int k){
        ans = 0;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(i+1);
        }
        //System.out.println(li);
        int idx=0; 
        k=k-1;
        solving(li,idx,k,ans);
        return ans;
    }
    public static void solving(ArrayList<Integer> li, int idx,int k,int ans1){
        if(li.size()==1){
            ans1 = li.get(0);
            ans = ans1;
            //System.out.println(ans);
            return ;
        }
        int idx1 = (idx+k)%li.size();
        //System.out.println(li.size());
        //System.out.println(li.remove(idx1));
        li.remove(idx1);
        solving(li,idx1,k,ans);
    }

}
