package string;
import java.util.*;
public class printanagrams {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.next();
        }
        //System.out.println(arr[3]);
        //System.out.println(anagrams(arr,n));
        anagrams(arr,n);
        sc.close();
    }
    public static void  anagrams(String[] arr, int n){
        HashMap<String , ArrayList<String>> h = new HashMap<String , ArrayList<String>>();
        for(int i=0; i<n;i++){
            char[] a =arr[i].toCharArray();
            Arrays.sort(a);
            String ans = String.valueOf(a);
            //System.out.println(stra);
            if(!h.containsKey(ans)){
                ArrayList<String> li = new ArrayList<>();
                li.add(arr[i]);
                h.put(ans,li);
            }else if(h.containsKey(ans)){
                //ArrayList<String> li = new ArrayList<>();
                h.get(ans).add(arr[i]);
            }

        }
        for (String name : h.keySet()){
            for(int k=0;k<h.get(name).size();k++){
                System.out.print(h.get(name).get(k)+" ");
            }
            System.out.println();
        }
    }

}
