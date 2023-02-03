import java.util.*;

public class catalanNumberRec {

    public static int catalan(int n) {
        if(n==0 || n==1) return 1;

        int ans = 0;
        for(int i=0; i<n; i++)
        ans += catalan(i)*catalan(n-i-1);

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = 4;
            System.out.print(catalan(n));

        } finally {
            sc.close();
        }

    }
}