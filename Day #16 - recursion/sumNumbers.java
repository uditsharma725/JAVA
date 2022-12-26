import java.util.*;

public class sumNumbers {

    public static int sumN(int n) {
        if(n == 1) return 1;
        return (n + sumN(n-1));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            System.out.print(sumN(n));     

        } finally {
            sc.close();
        }

    }
}