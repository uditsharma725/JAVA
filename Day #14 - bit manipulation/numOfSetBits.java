import java.util.*;

public class numOfSetBits {

    public static int setBits(int num) {
        int cnt = 0;
        while(num !=0) {
            if((num & 1) == 1) cnt++;
            num = (num >> 1);
        }

        return cnt;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int num = sc.nextInt();
            System.out.print(setBits(num));

        } finally {
            sc.close();
        }

    }
}