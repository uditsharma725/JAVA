import java.util.*;

public class qMinAbsDiff {

    public static int maxAbsDiff(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        
        int ans = 0;
        for(int i=0; i<a.length; i++) {
            ans += Math.abs(a[i]-b[i]);
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            
            int a[] = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();

            int b[] = new int[n];
            for(int i=0; i<n; i++) b[i] = sc.nextInt();

            System.out.print(maxAbsDiff(a, b));

        } finally {
            sc.close();
        }

    }
}