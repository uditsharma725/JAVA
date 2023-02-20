import java.util.*;

public class creatingST {

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

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
            init(arr.length);
            buildST(arr, 0, 0, arr.length-1);

            for(int i=0; i<tree.length; i++) {
                System.out.print(tree[i] + " ");
            }

        } finally {
            sc.close();
        }

    }
}