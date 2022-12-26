import java.util.*;

public class primeRange {
    public static boolean isPrime(long num) {
        if(num == 1) return false;
        for(long i=2; i<=Math.sqrt(num); i++) if(num%i == 0) return false;
        return true;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long start = sc.nextLong();
            long end = sc.nextLong();
            for(long i=Math.abs(start); i<Math.abs(end); i++) 
                if(isPrime(i)) System.out.print(i + " ");
        }
    }
}
