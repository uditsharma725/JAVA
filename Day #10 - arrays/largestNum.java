import java.util.*;

/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/

public class largestNum {

    // print array function:
    public static void print(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // input array function:
    public static void input(int arr[], int size, Scanner sc) {
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int size = sc.nextInt();
            int arr[] = new int[size];
            input(arr, size, sc);

            int maxNo = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                if (arr[i] > maxNo)
                    maxNo = arr[i];
            }

            print(arr, size);
            System.out.print("Largest Number =  " + maxNo);

        } finally {
            sc.close();
        }

    }
}
