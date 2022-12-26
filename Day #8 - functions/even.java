import java.util.*;

public class even {
    public static boolean isEven(long a) {
        return a%2 == 0;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            if(isEven(a) == true) System.out.print("YES");
            else System.out.print("NO");
        }
    }    
}
