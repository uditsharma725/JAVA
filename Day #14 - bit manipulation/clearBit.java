import java.util.*;

public class clearBit {

    public static int clear(int num, int bit) {
        int ans = num;
        int mask = (1 << bit);
        if((num & mask) < 1) {}
        else {
            mask = ~(mask);
            ans = (num & mask);
        }

        return ans;
        // return (num & (~(1 << bit)));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int bit = sc.nextInt();

            System.out.print(clear(num, bit));

        } finally {
            sc.close();
        }

    }
}