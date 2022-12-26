import java.util.*;

public class fastExponentiation {

    public static int exp(int num, int power) {
        int ans = 1;

        while(power != 0) {
            if((power & 1) != 0) ans *= num;
            num *= num;
            power = (power >> 1);
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            int power = sc.nextInt();

            System.out.print(exp(num, power));

        } finally {
            sc.close();
        }

    }
}