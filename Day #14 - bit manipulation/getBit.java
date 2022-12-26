import java.util.*;

public class getBit {

    public static boolean checkBit(int num, int bit) {
        int mask = (1 << bit);
        if((num & mask) >= 1) return true;
        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int bit = sc.nextInt();

            if (checkBit(num, bit))
                System.out.print("1");
            else
                System.out.print("0");

        } finally {
            sc.close();
        }

    }
}