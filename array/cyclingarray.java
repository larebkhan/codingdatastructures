class Compute {
    
    public static void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for (int i = n-1; i>= 0 ;i--) {
        
            if(i == 0){
                arr[i] = temp;
            }else{
            arr[i] = arr[i-1];
        }
        }
    }
public static void main(String[] args)
    {
        int arr[] = {1 ,2, 2, 4, 5};
        int n = 5;
        rotate(arr,n);
        for ( int e = 0 ; e< n ; e++) {
            System.out.println(arr[e]);
        }

    }
}