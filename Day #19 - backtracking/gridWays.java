import java.util.*;

public class gridWays {

    public static int grid1(int i, int j, int n, int m) {
        if(i == n-1 && j == m-1) return 1;
        else if(i == n || j == m) return 0;
        
        int w1 = grid1(i+1, j, n, m);
        int w2 = grid1(i, j+1, n, m);

        return w1+w2;
    }

    public static int fact(int n) {
        if(n == 0)  return 1;
        return n*fact(n-1);
    }

    public static int grid2(int n, int m) {
        int numerator = fact((n-1)+(m-1));
        int d1 = fact(n-1);
        int d2 = fact(m-1);

        return numerator/(d1*d2);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n=3, m=4;

            int ways1 = grid1(0, 0, n, m);
            int ways2 = grid2(n, m);

            System.out.print(ways1 + " " + ways2);

        } finally {
            sc.close();
        }

    }
}