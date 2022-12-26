import java.util.*;

public class binaryString {

    public static void binaryStr(int n, int last, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        binaryStr(n-1, 0, str+"0");
        if(last == 0) binaryStr(n-1, 1, str+"1");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            String str = "";
            binaryStr(n, 0, str);

        } finally {
            sc.close();
        }

    }
}