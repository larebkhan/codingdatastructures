package string;
import java.util.*;
public class kjsdnf {
    static final int MAX_CHARS = 256;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(findSubString(str));
        in.close();
    }
    public static String findSubString(String str){
    int n = str.length();
    // if string is empty or having one char
    if (n <= 1)
        return str;
    // Count all distinct characters.
    int dist_count = 0;
    boolean[] visited = new boolean[MAX_CHARS];
    Arrays.fill(visited, false);
    for (int i = 0; i < n; i++) {
        if (visited[str.charAt(i)] == false) {
            visited[str.charAt(i)] = true;
            dist_count++;
        }
    }
    // Now follow the algorithm discussed in below
    // post. We basically maintain a window of
    // characters that contains all characters of given
    // string.
    int start = 0, start_index = -1;
    int min_len = Integer.MAX_VALUE;
    int count = 0;
    int[] curr_count = new int[MAX_CHARS];
    for (int j = 0; j < n; j++) {
        // Count occurrence of characters of string
        curr_count[str.charAt(j)]++;
        // If any distinct character matched,
        // then increment count
        if (curr_count[str.charAt(j)] == 1){
            count++;
            //System.out.println(curr_count[str.charAt(j)]);
        }
            //System.out.println(count+ "count upgrad");
        // if all the characters are matched
        //System.out.println(j+"val of j");
        if (count == dist_count) {
            // Try to minimize the window i.e., check if
            // any character is occurring more no. of
            // times than its occurrence in pattern, if
            // yes then remove it from starting and also
            // remove the useless characters.
            //System.out.println(curr_count[str.charAt(start)]);
            while (curr_count[str.charAt(start)] > 1) {
                if (curr_count[str.charAt(start)] > 1)
                    curr_count[str.charAt(start)]--;
                start++;
                //System.out.println(curr_count[str.charAt(start)]+"..");
                //System.out.println(start);
            }   
            //System.out.println(" ");
            // Update window size
            int len_window = j - start + 1;
            //System.out.println(len_window+"len");
            if (min_len > len_window) {
                min_len = len_window;
                start_index = start;
            }
        }
    }
    // Return substring starting from start_index
    // and length min_len
    return str.substring(start_index,
                         start_index + min_len);
}
}
