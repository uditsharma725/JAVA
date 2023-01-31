import java.util.*;

public class qEditDistance {

    public static int editDistance(String a, String b) {
        int n = a.length();
        int m = b.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=m; j++) {
                if(i == 0) dp[i][j] = j;
                if(j == 0) dp[i][j] = i;
            }
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(a.charAt(i-1) == b.charAt(j-1))
                dp[i][j] = dp[i-1][j-1];

                else {
                    int add = dp[i][j-1] + 1;
                    int del = dp[i-1][j] + 1;
                    int rep = dp[i-1][j-1] + 1;

                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String a = "intention";
            String b = "execution";
            
            System.out.print(editDistance(a, b));

        } finally {
            sc.close();
        }

    }
}