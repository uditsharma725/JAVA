import java.util.*;

public class mcmMem {

    public static int mcm(int arr[], int i, int j, int dp[][]) {
        if(i == j) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int costSet1 = mcm(arr, i, k, dp);
            int costSet2 = mcm(arr, k+1, j, dp);
            int combineSets = arr[i-1] * arr[k] * arr[j];

            int finalCost = costSet1 + costSet2 + combineSets;
            ans = Math.min(ans, finalCost);
        }

        return dp[i][j] = ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 2, 3, 4, 3};
            int n = arr.length;
            
            int dp[][] = new int[n][n];
            for(int i=0; i<n; i++) Arrays.fill(dp[i], -1);
            System.out.print(mcm(arr, 1, n-1, dp));

        } finally {
            sc.close();
        }

    }
}