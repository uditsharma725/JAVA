import java.util.*;

public class qLCSubstring {

    public static int lcs(String a, String b) {
        int n = a.length();
        int m = b.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[i].length; j++) {
                dp[i][j] = 0;
            }
        }

        int ans = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }

                else dp[i][j] = 0;
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String a = "ABCDE";
            String b = "ABGCD";

            System.out.print(lcs(a, b));

        } finally {
            sc.close();
        }

    }
}