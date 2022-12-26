import java.util.*;

public class binaryTOdecimal {
    public static long toDecimal(long num) {
        long decimal = 0;
        long two = 1;
        while(num !=0){
            long last = num%10;
            decimal = decimal + two*last;
            two*=2;
            num/=10;
        }
        return decimal;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long binary = sc.nextLong();
            System.out.print(toDecimal(binary));
        }
    }
}
