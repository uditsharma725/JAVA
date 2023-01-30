import java.util.*;

public class qCoinChange {

    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<dp.length; i++) dp[i][0] = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sum; j++) {
                int c = coins[i-1]; 
                
                if(c<=j) {
                    int include = dp[i][j-c];
                    int exclude = dp[i-1][j];

                    dp[i][j] = include + exclude;
                }
                else dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][sum];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int coins[] = {2, 5, 3, 6};
            int sum = 10;

            System.out.print(coinChange(coins, sum));

        } finally {
            sc.close();
        }

    }
}