package contest;
import java.util.*;
public class wiley {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++)
    {
        for(int j=1; j<i; j++)
        {
            System.out.print("  ");
            // if(i==N && j==i-1){
            //     System.out.print("");
            // }
        }
        System.out.print(i);
        for(int j=1; j<=(((N-i)*2 * 2-1 )); j++)
        {
            System.out.print(" ");
        }
        if(i != N)
            System.out.print(i);
        System.out.println();
        //System.out.println();
    }

    for(int i=N-1; i>=1; i--)
    {
        // Print trailing spaces
        for(int j=1; j<i; j++)
        {
            System.out.print("  ");
        }

        System.out.print(i);

        // Print central spaces
        for(int j=1; j<=(((N - i )*2* 2-1)); j++)
        {
            System.out.print(" ");
        }

        System.out.print(i);

        // Move on to the next line
        System.out.println();
        //System.out.println();
    }

    return ;
    }
}
