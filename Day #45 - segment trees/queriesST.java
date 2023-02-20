import java.util.*;

public class queriesST {

    static int tree[];
    public static void init(int n) {
        tree = new int[4*n];
    }

    public static int buildST(int arr[], int i, int s, int e) {
        if(s == e) {
            tree[i] = arr[s];
            return arr[s];
        }

        int mid = s + ((e-s)/2);
        buildST(arr, 2*i+1, s, mid);
        buildST(arr, 2*i+2, mid+1, e);

        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }

    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if(qj <= si || qi >= sj) return 0;
        else if(si >= qi && sj <= qj) return tree[i];
        else {
            int mid = (si + sj)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);

            return left + right;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
            init(arr.length);
            buildST(arr, 0, 0, arr.length-1);

            System.out.print(getSum(arr, 2, 5));

        } finally {
            sc.close();
        }

    }
}