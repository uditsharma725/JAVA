import java.util.*;

public class average {
    public static long aver(long a, long b) {
        return a+b;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.print(aver(a,b));
        }

        
    }
}