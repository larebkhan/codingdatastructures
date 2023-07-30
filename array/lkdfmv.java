package array;
public class lkdfmv {
    public  static void   main (String [] args) {
        int arr[] = {1 , 2, 3 , -4 ,5 , 1 ,-3 , 4};
        int n = 8;
        int re = maxSubarraySum(arr,n); // yaha agar bina re k call kr ra tha toh error show ho ra tha
        System.out.println(re);
    }
    public static int maxSubarraySum(int arr[], int n){ // yaha method ka return type void hatana pada 
        int maxsum = 0;
        int cursum = 0;
        int l = 0 ;
        int m = 0;
        for ( int i = 0 ; i < arr.length ; i++) {
            if (arr[i]< 0){
                ++l;
                if(l==1){
                    m = arr[i];
                }
                if (arr[i] > m ){
                    m = arr[i];
                }
            }
            cursum = cursum + arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0){
                cursum = 0;
            }
        }
        if(maxsum == 0 ){
            return m;
        }else {
            return maxsum;
        }
    }
}
