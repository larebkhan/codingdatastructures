// package slidingvariable;
// import java.util.*;
// public class lastques {
//     public static void main(String [] args){
//         Scanner in=new Scanner(System.in);
//         String s=in.next();
//         String sb=in.next();
//         System.out.println(last(s,sb));
//         in.close();
//     }
//     public static String last(String s, String sb){
//         HashMap<Character, Integer> h = new HashMap<>();
//         int n1 = s.length();
//         for(int i=0;i<n1;i++){
//             if(h.containsKey(s.charAt(i))){
//                 h.put(s.charAt(i), h.get(s.charAt(i))+1);
//             }else{
//                 h.put(s.charAt(i),1);
//             }
//         }
//         int x=0,j=0,count=h.size(),n=sb.length(),ans=0,minans=Integer.MAX_VALUE,end=0;
//         String rt ="";
//         while(j<n){
//             if(h.containsKey(sb.charAt(j))){
//                 h.put(sb.charAt(j),h.get(sb.charAt(j))-1);
//                 if(h.get(sb.charAt(j))==0){
//                     count--;
//                 }
//             }else{
//                 j++;
//                 continue;
//             }
//             if(count==0){
//                 ans = j-x+1;
//                 if(ans<minans){
//                     minans = ans;
//                     start = x;
//                     end = j;
//                 }
//                 System.out.println(h);
//                 while(count==0){
//                     if(h.containsKey(sb.charAt(x))){
//                         if(count==0){
//                         h.put(sb.charAt(x),h.get(sb.charAt(x))+1);}
//                         else{continue;}
//                         if(h.get(sb.charAt(x))>0){
//                             count++;
//                         }
//                         x++;
//                     }else{
//                         x++;
//                     }
//                     System.out.println(h);
//                 }
//                 if(count!=0){
//                     while(!h.containsKey(sb.charAt(x))){
//                         x++;
//                     }
//                     System.out.println(x);
//                 }
//             }
//             j++;
//         }
//         for(int i=x; i<end;i++){
//             rt = rt + sb.charAt(i);
//         }
//         return rt;
//     }
// }
