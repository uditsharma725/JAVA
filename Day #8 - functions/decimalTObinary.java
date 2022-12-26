import java.util.*;

public class decimalTObinary {
    public static long reverse(long num) {
        long rev = 0;
        while(num != 0) {
            long last = num%10;
            rev = rev*10 + last;
            num/=10;
        }

        return rev;
    }

    public static long toBinary(long num) {
        long binary = 0;
        while(num != 0){
            long remainder = num%2;
            binary = binary*10 + remainder;
            num/=2; 
        }

        long ans = reverse(binary);
        return ans;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long decimal = sc.nextLong();

            System.out.println("Does not work properly because of the '0'"); System.out.println();
            System.out.print(toBinary(decimal));
        }
    }
}
