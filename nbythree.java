import java.util.*;
class nbythree{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        nthree(arr,n);
        in.close();

    }
    public static void nthree(int []arr,int n){
        ArrayList <Integer> li = new ArrayList<>();
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            if(count>(n/3)){
                li.add(arr[i]);
            }
            if(arr[i]!=arr[i+1]){
                count=0;
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(li.get(i));
        }


    }
}