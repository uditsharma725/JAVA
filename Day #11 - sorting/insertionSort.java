import java.util.*;

public class insertionSort {

    // print array function:
    public static void print(int var[]) {
        for (int num : var)
            System.out.print(num + " ");
        System.out.println();
    }

    // input array function:
    public static void input(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }

    public static void insertion(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding the correct position:
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //inserting the element at correct positon:
            arr[prev+1] = curr;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, sc);

            insertion(arr);
            print(arr);

        } finally {
            sc.close();
        }

    }
}
/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/