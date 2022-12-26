import java.util.*;

public class powerOfTwo {

    public static boolean power(int num) {
        if((num & (num-1)) == 0) return true;
        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            if(power(num)) System.out.print("YES");
            else System.out.print("NO");

        } finally {
            sc.close();
        }

    }
}