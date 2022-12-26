import java.util.*;

public class q1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            if(num >= 0) System.out.println("positive");
            else System.out.println("negative");
        }
    }
}