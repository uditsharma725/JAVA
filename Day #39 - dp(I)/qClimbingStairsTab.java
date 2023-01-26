import java.util.*;

public class qClimbingStairsTab {

    public static int ways() {
        int n = 4;
        int dp[] = new int[n+1];

        dp[0] = 1;
        if(n >= 2) {
            dp[1] = 1;
            dp[2] = 2;

            for(int i=3; i<=n; i++) 
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        else return 1;

        return dp[n];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.print(ways());

        } finally {
            sc.close();
        }

    }
}