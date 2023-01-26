import java.util.*;

public class fibonacciMemo {

    public static int fib(int n, int f[]) {
        if(n == 0 || n == 1) return n;

        if(f[n] != 0) return f[n];
        return f[n] = fib(n-1, f) + fib(n-2, f);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = 25;
            int f[] = new int[n+1];
            System.out.print(fib(n, f));

        } finally {
            sc.close();
        }

    }
}