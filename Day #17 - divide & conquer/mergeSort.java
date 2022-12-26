import java.util.*;

public class mergeSort {

    public static void mergesort(int arr[], int s, int e) {
        if(s >= e) return;

        int mid = s + (e-s)/2;
        mergesort(arr, s, mid);         // left part 
        mergesort(arr, mid+1, e);       // right part

        merge(arr, s, mid, e);
    }

    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e-s+1];
        
        int i = s;                              // left part
        int j = mid+1;                          // right part
        int k = 0;                              // temp array

        while(i <= mid && j <= e) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // left part:
        while(i <= mid) temp[k++] = arr[i++];

        // right part:
        while(j <= e) temp[k++] = arr[j++];

        // coping temp array into the original array:
        for(k=0, i=s; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {6, 3, 9, 5, 2, 8};
            mergesort(arr, 0, arr.length-1);

            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } finally {
            sc.close();
        }

    }
}