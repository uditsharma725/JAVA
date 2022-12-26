import java.util.*;

public class reverseOfNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            int reverse = 0;
            while (num != 0) {
                int lastNumber = num % 10;
                reverse = (reverse * 10) + lastNumber;
                num/=10;
            }

            System.out.print(reverse);
        }
    }
}