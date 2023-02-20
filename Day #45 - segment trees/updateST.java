import java.util.*;

public class updateST {

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
  
    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;

        updateUtil(0, 0, n-1, idx, diff);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if(idx > sj || idx < si) return;

        tree[i] += diff;
        if(si != sj) {
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);
            updateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
            init(arr.length);
            buildST(arr, 0, 0, arr.length-1);

            for(int i=0; i<15; i++) System.out.print(tree[i] + " ");
            System.out.println(); System.out.println();
            update(arr, 2, 2);
            for(int i=0; i<15; i++) System.out.print(tree[i] + " ");

        } finally {
            sc.close();
        }

    }
}