import java.util.*;

public class quickSort {

    public static void quicksort(int arr[], int s, int e) {
        if(s >= e) return;

        int pIdx = partition(arr, s, e);        // sorting the array

        quicksort(arr, s, pIdx-1);              // left part
        quicksort(arr, pIdx+1, e);              // right part
    }

    public static int partition(int arr[], int s, int e) {
        int j = s-1;                    // !important to use this not i = -1
        int pivot = arr[e];
        
        for(int i=s; i<e; i++) {
            if(arr[i] <= pivot) {
                j++;

                // swap function:
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // for pivot:
        j++;
        int temp = arr[j];
        arr[j] = arr[e];
        arr[e] = temp;

        return j;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {6, 3, 9, 8, 2, 5};
            quicksort(arr, 0, arr.length-1);

            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } finally {
            sc.close();
        }

    }
}