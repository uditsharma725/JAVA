import java.util.*;

public class clearLastBits {

    public static int clearL(int num, int bit) {
        int mask = ((~0) << bit);
        return (num & mask);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int bit = sc.nextInt();
            
            System.out.print(clearL(num, bit));

        } finally {
            sc.close();
        }

    }
}