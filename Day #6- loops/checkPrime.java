import java.util.*;

public class checkPrime {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            boolean flag = false;
            for(int i=2; i<=Math.sqrt(num); i++) {
                if(num%i != 0) continue;
                else flag = true;
            }

            if(flag == true) System.out.print("NO");
            else System.out.print("YES");
        }        
    }
}