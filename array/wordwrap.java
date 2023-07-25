import java.util.*;
public class wordwrap {
    public static List<Integer> permutation(int n,int[] a)
    {
        int s =-1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = n-2; i >=0; i--){
            if(a[i]< a[i+1]){
                s = i;
                break;
            }
        }
        if(s==-1){
            Arrays.sort(a);
        }
        else{
            for(int i = n-1; i >s; i--){
                if(a[i]> a[s]){
                    int temp = a[s];
                    a[s] = a[i];
                    a[i] = temp;
                    break;
                }
            }
            int i=s+1, j=n-1;
            while(i<=j){
                int t1=a[i];
                a[i++]=a[j];
                a[j--]=t1;
            }
        }
        for(int d = 0 ; d < n;d++){
            list.add(a[d]);
        }
        return list;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        //permutation(n,a);
        System.out.println(permutation(n,a));
        in.close();
    }
}