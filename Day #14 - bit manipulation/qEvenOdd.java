import java.util.*;

public class qEvenOdd {

    public static boolean check(int num) {
        if((num & 1) == 1) return false;
        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            if(check(num)) System.out.print("EVEN");
            else System.out.print("ODD");

        } finally {
            sc.close();
        }

    }
}