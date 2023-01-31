import java.util.*;

public class qStringConversion {

    public static int lcs(String a, String b) {
        int n = a.length();
        int m = b.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(a.charAt(i-1) == b.charAt(j-1))
                dp[i][j] = dp[i-1][j-1]+1;

                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }

    public static void stringConversion(String a, String b) {
        int lcs = lcs(a, b);

        System.out.println((int)(a.length() - lcs));    // deletion
        System.out.println((int)(b.length() - lcs));    // insertion
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String a = "ABCDEF";
            String b = "ACEG";

            stringConversion(a, b);

        } finally {
            sc.close();
        }

    }
}