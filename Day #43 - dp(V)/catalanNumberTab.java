import java.util.*;

public class catalanNumberTab {

    public static int catalan(int n) {
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;

        for(int i=2; i<=n; i++) {
            for(int j=0; j<i; j++) {
                dp[i] += dp[j]*dp[i-j-1]; 
            }
        }

        return dp[n];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n =4;
            System.out.print(catalan(n));

        } finally {
            sc.close();
        }

    }
}