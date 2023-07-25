// import java.util.*;
// class triplet{
//     public static List<Integer> sumtri(int[] arr,int n,int x){
//         int p=0;
//         List<Integer> li = new ArrayList<>();
//         Arrays.sort(arr);
//         for(int z=0;z<n;z++){
//             int ans = x-arr[z];
//             int j=n-1;
//             for(int i=z+1;i<n;i++){
//                 if(i<=j){
//                     if((arr[i]+arr[j]>ans)){
//                         j--;
//                     }else if((arr[i]+arr[j]<ans)){
//                         i++;
//                     }else if((arr[i]+arr[j]==ans)){
//                         li.add(arr[i]);
//                         li.add(arr[j]);
//                         p = arr[i] + arr[j];
//                     }

//                 }else{
//                     break;
//                 }
//             }if((p+arr[z])==x){
//                 li.add(arr[z]);
//                 break;
//             }
//         }
//         return li;
//     }
//     public static void main(String args[]){
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int x=in.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++)
//             arr[i]=in.nextInt();
//         System.out.println(sumtri(arr,n,x));
//         in.close();
//     }
// }






import java.util.*;
class triplet{
    public static List<Integer> sumtri(int[] arr,int n,int x){
        List<Integer> li = new ArrayList<>();
        Arrays.sort(arr);
        for(int z=0;z<n;z++){
            int i=z+1;
            int j=n-1;
            while(i<j){
                    if((arr[z]+arr[i]+arr[j]>x)){
                        j--;
                    }else if((arr[z]+arr[i]+arr[j]<x)){
                        i++;
                    }else if((arr[z]+arr[i]+arr[j]==x)){
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[z]);
                        break;
                }
            }
        }
        return li;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println(sumtri(arr,n,x));
        in.close();
    }
}