import java.util.*;
class rearrange{
    public static int[] main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arrange(arr,n);
        sc.close();
        return arr;
    }
    public static void arrange(int[]arr ,int n){
        List <Integer> la = new ArrayList<>();
        List <Integer> li = new ArrayList<>();
        int s=0;
        int f=0;
        int u=0;
        for(int i= 0;i< n;i++){
            if(arr[i]<0){
                li.add(arr[i]);
            }else if(arr[i]>=0){
                la.add(arr[i]);
            }
        }
        int m = la.size();
        int j = li.size();
        /*for(;s<m;s++){
            System.out.print(la.get(s)+" ");
            if(s>=j||s>=m)
            break;
            System.out.print(li.get(s)+" ");
        }
        if(s>=m&&s<j){
            for(int i=s+1;i<j;i++){
                System.out.print(li.get(i)+" ");
            }      
        }else if(s>=j&&s<m){
            for(int i=s+1;i<m;i++){
                System.out.print(la.get(i)+" ");
            }
        }*/
        for(;u<=m&&u<=j;u++){
            if(u%2==0){
                arr[u]=la.get(f);
                f++;
            }else{
                arr[u]=li.get(f);
                f++;
            }
        }
        if(u>=m&&u<j){
            for(int i=u+1 ; i<j;i++){
                arr[i]=li.get(i);
            }
        }else if(u>=j&&u<m){
            for(int i=u+1;u<m;u++){
                arr[i]=la.get(i);
            }
        }
    }
}
