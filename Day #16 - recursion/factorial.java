import java.util.*;

public class factorial {

    public static int fac(int n) {
        if(n == 0) return 1;
        return (n * fac(n-1));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            System.out.print(fac(n));

        } finally {
            sc.close();
        }

    }
}