import java.util.*;

public class qRodCutting {

    public static int rodCutting(int len[], int price[], int R) {
        int n = len.length;
        int dp[][] = new int[n+1][R+1];
        for(int i=0; i<dp.length; i++) dp[i][0] = 0;
        for(int j=0; j<dp[0].length; j++) dp[0][j] = 0;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=R; j++) {
                int l = len[i-1];
                int p = price[i-1];

                if(l<=j) {
                    int include = p + dp[i][j-l];
                    int exclude = dp[i-1][j];

                    dp[i][j] = Math.max(include, exclude);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][R];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int len[] = {1, 2, 3, 4, 5, 6, 7, 8};
            int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
            int R = 8;

            System.out.print(rodCutting(len, price, R));

        } finally {
            sc.close();
        }

    }
}