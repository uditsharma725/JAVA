import java.util.*;

public class qMinimumPartitioning {

    public static int minPartition(int arr[]) {
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<n; i++) sum += arr[i];
        int W = sum/2;

        int dp[][] = new int[n+1][W+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=W; j++) {
                int val = arr[i-1];

                if(val<=j) {
                    int include = val + dp[i-1][j-val];
                    int exclude = dp[i-1][j];
                    
                    dp[i][j] = Math.max(include, exclude);
                }

                else dp[i][j] = dp[i-1][j];
            }
        }

        int sum1 = dp[n][W];
        int sum2 = sum - sum1;

        return Math.abs(sum1 - sum2);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 6, 11, 5};
            System.out.print(minPartition(arr));

        } finally {
            sc.close();
        }

   }
}