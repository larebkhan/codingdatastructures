import java.util.Scanner;

class union {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF BOTH ARRAY");
        int n = 0;
        int m = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        int a [] = new int[n];
        int b[] = new int[m];
        int k[] = new int[n+m];
        System.out.println("ENTER elements of 1st ARRAY");
        for (int f = 0 ; f < n ; f++) {
            a[f] = sc.nextInt();
        }
        System.out.println("enter elements of 2nd array");
        for( int z= 0 ; z< m ;z++) {
            b[z] = sc.nextInt();
        }
        int i = 0 ;
        int l = 0;
        int j = 0;
        k[l] = a[i];
        i++;
        l++;
        while ((i < n) && (j < m)){  //0 < 3 && 0< 3
            
            if (a[i] == b[j]){
                if (a[i] == k[l-1]){
                continue;
                }else{
                k[l++] = a[i++];
                j++;
                }
            
            }else if (a[i] < b[j]){
                if (a[i] == k[l-1]){
                    continue;
                    }else{
                    k[l++] = a[i++];
                    }
            }else if (a[i] > b[j]) {
                if (b[j] == k[l-1]){
                    continue;
                }else {
                k[l++] = b[j++];
                }
            }
        }
        if(j < m) {
            while(j < m){
               if (b[j] == k[l-1]){
                   continue;
               }else {
               k[l++] = b[j++];
               }
            }
        }
        else if(i<n){   
             while(i < n){
                if (a[i] == k[l-1]){
                    continue;
                }else {
                k[l++] = a[i++];
                }
            }
        }
        System.out.println("output");
        for (int y = 0 ; y < l; y++) {
            System.out.println(k[y]);
        }


    }
}