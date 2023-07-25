import java.util.*;
class readrrange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        rearrange(arr,n);
        sc.close();
        return;
    }
    static void rotate(int[] arr,int i, int j){
        int temp = arr[j];
        for(int z=j;z>i;z--){
            arr[z]=arr[z-1];
        }
        arr[i]=temp;
    }
    static void rearrange(int arr[], int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]>=0&&i%2==0||arr[j]<0&&i%2!=0){
                    if(i!=j)
                    rotate(arr,i,j);
                    break;
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }//9, 4, -2, -1, 5, 0, -5, -3, 2
    /*public static void arrange(int[]arr ,int n){
        List <Integer> la = new ArrayList<>();
        List <Integer> li = new ArrayList<>();
        int s=0;
        for(int i= 0;i< n;i++){
            if(arr[i]<0){
                li.add(arr[i]);
            }else if(arr[i]>=0){
                la.add(arr[i]);
            }
        }
        int m = la.size();
        int j = li.size();
        for(;s<m;s++){
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
        /*for(;u<=m&&u<=j;u++){
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
        }*/  
}
