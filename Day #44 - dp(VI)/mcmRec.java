import java.util.*;

public class mcmRec {

    public static int mcm(int arr[], int i, int j) {
        if(i == j) return 0;

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int costSet1 = mcm(arr, i, k);
            int costSet2 = mcm(arr, k+1, j);

            int combineSets = arr[i-1] * arr[k] * arr[j];
            int finalCost = costSet1 + costSet2 + combineSets;
            
            ans = Math.min(ans, finalCost);
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 2, 3, 4, 3};
            int n = arr.length;
            
            System.out.print(mcm(arr, 1, n-1));

        } finally {
            sc.close();
        }

    }
}