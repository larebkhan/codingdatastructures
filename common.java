import java.util.*;
class common{
    public static void commmon(int[] arr1,int[] arr2,int[] arr3){
        int n1= arr1.length;
        int n2= arr2.length;
        int n3= arr3.length;
        int i=0;
        int j=0;
        int k=0;
        List <Integer> li = new ArrayList<>();
        while(i!=(n1)&&j!=n2&&k!=n3){
            if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
                li.add(arr1[i]);
                i++;
                j++;
                k++;
            }else{
                if(arr1[i]<arr2[j]&&arr1[i]<arr3[k]){
                    i++;
                }else if(arr2[j]<arr1[i]&&arr2[j]<arr3[k]){
                    j++;
                }else if(arr3[k]<arr2[j]&&arr3[k]<arr1[i]){
                    k++;
                }
            }
            
        }
        for(int l =0 ; l<li.size();l++){
            System.out.println(li.get(l));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] arr1= new int[n1];
        int[] arr2= new int[n2];
        int[] arr3= new int[n3];
        for(int i= 0 ; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i= 0 ; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i= 0 ; i<n3; i++){
            arr3[i] = sc.nextInt();
        }
        commmon( arr1,arr2,arr3);
        sc.close();
}
}