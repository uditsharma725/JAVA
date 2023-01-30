import java.util.*;

public class qLCSMemo {

    public static int lcs(String a, String b, int n, int m, int dp[][]) {
        if(n==0 || m==0) return 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(a.charAt(n-1) == b.charAt(m-1))
        return dp[n][m] = lcs(a, b, n-1, m-1, dp)+1;

        else {
            int ans1 = lcs(a, b, n-1, m, dp);
            int ans2 = lcs(a, b, n, m-1, dp);

            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            String a = "abcde";
            String b = "ace";

            int dp[][] = new int[a.length()+1][b.length()+1];
            for(int i=0; i<dp.length; i++) {
                for(int j=0; j<dp[0].length; j++) {
                    dp[i][j] = -1;
                }
            }

            System.out.print(lcs(a, b, a.length(), b.length(), dp));


        } finally {
            sc.close();
        }

    }
}