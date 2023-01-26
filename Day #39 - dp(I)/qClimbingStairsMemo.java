import java.util.*;

public class qClimbingStairsMemo {

    public static int ways(int n, int f[]) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(f[n] != 0) return f[n];

        return f[n] = ways(n-1, f) + ways(n-2, f);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = 5;
            int f[] = new int[n+1];
            System.out.print(ways(n, f));

        } finally {
            sc.close();
        }

    }
}