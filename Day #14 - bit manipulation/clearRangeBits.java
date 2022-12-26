import java.util.*;

public class clearRangeBits {

    public static int clearR(int num, int start, int end) {

        int i = ((1 << start) - 1);
        int j = ((~0) << end);

        int mask = (i | j);
        return (num & mask);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.print(clearR(num, start, end));

        } finally {
            sc.close();
        }

    }
}