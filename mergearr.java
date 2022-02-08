// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GFG {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int m = Integer.parseInt(inputLine[1]);
                int arr1[] = new int[n];
                int arr2[] = new int[m];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr1[i] = Integer.parseInt(inputLine[i]);
                }
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < m; i++) {
                    arr2[i] = Integer.parseInt(inputLine[i]);
                }
    
                new Solution().merge(arr1, arr2, n, m);
    
                StringBuffer str = new StringBuffer();
                for (int i = 0; i < n; i++) {
                    str.append(arr1[i] + " ");
                }
                for (int i = 0; i < m; i++) {
                    str.append(arr2[i] + " ");
                }
                System.out.println(str);
            }
        }
    }// } Driver Code Ends
    
    
    class Solution {
    
        public void merge(int arr1[], int arr2[], int n, int m) {
            int a = 0;
            int b = 0 ;
            int f =0;
            int r= 0;
            int temp = 0;
            for (int i = 0 ; i < n ; i++){
                if (arr1[a] < arr2[b]){
                    a++;
                }else {
                    f = arr1[a];
                    arr1[a] = arr2[b];
                    arr2[b] = f;
                    r = b;
                    a++;
                    if (m ==1){
                        continue;
                    }else {
                    while(arr2[r] > arr2[r+1] ){
                        temp = arr2[r];
                        arr2[r] = arr2[r+1];
                        arr2[r+1] = temp;
                        r++;
                        if (r == (arr2.length - 1))
                        break;
                        //if(r == m);
                        //break;
                    }
                    }
                    
                }
            }
        }
    }