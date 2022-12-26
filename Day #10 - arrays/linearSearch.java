import java.util.*;

public class linearSearch {

    // print the array:
    public static void print(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    // input the array:
    public static void input(int arr[], int size, Scanner sc) {
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }

    public static int lSearch(int arr[], int size, int key) {
        for (int i = 0; i < size; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int size = sc.nextInt();
            int arr[] = new int[size];
            input(arr, size, sc);
            int key = sc.nextInt();

            int found = lSearch(arr, size, key);
            if (found != -1)
                System.out.print("index = " + found + " value = " + arr[found]);
            else System.out.print("Not Found");

        } finally {
            sc.close();
        }
    }
}
