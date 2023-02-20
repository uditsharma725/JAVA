import java.util.*;

public class qMaxElement {

    static int tree[];
    public static void intit(int n) {
        tree = new int[4*n];
    }

    public static void BT(int arr[], int i, int si, int sj) {
        if(si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si+sj)/2;
        BT(arr, 2*i+1, si, mid);
        BT(arr, 2*i+2, mid+1, sj);

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if(si > qj || sj < qi) return Integer.MIN_VALUE;
        
        else if(si >= qi || sj <= qj) return tree[i];

        else {
            int mid = (si+sj)/2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);

            return Math.max(left, right);
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        arr[idx] = newVal;
        
        updateUtil(0, 0, n-1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if(si > idx || sj < idx) return;

        tree[i] = Math.max(tree[i], newVal);
        if(si != sj) {
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
            int n = arr.length;
            intit(n);
            BT(arr, 0, 0, n-1);
           
            System.out.println(getMax(arr, 2, 5));
            update(arr, 2, 20);
            System.out.println(getMax(arr, 2, 5));

        } finally {
            sc.close();
        }

    }
}