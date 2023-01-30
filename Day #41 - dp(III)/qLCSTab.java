import java.util.*;

public class qLCSTab {

    public static int lcs(String a, String b) {
        int n = a.length();
        int m = b.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                dp[i][j] = 0;
            }
        }

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

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String a = "abcde";
            String b = "ace";

            System.out.print(lcs(a, b));

        } finally {
            sc.close();
        }

    }
}