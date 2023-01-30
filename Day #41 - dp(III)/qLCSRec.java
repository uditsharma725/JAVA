import java.util.*;

public class qLCSRec {

    public static int lcs(String a, String b, int n, int m) {
        if(n==0 || m==0) return 0;

        if(a.charAt(n-1) == b.charAt(m-1)) return lcs(a, b, n-1, m-1) + 1;

        else {
            int ans1 = lcs(a, b, n-1, m);
            int ans2 = lcs(a, b, n, m-1);

            return Math.max(ans1, ans2);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String a = "abcde";
            String b = "ace";

            System.out.print(lcs(a, b, a.length(), b.length()));

        } finally {
            sc.close();
        }

    }
}