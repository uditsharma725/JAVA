import java.util.*;

public class setBit {

    public static int setB(int num, int bit) {
        int ans = num;
        int mask = (1 << bit);
        if((num & mask) >= 1) {}
        else {
            ans = (num | mask);
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int bit = sc.nextInt();

            System.out.print(setB(num, bit));

        } finally {
            sc.close();
        }

    }
}