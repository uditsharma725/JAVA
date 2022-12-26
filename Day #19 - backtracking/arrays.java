import java.util.*;

public class arrays {

    public static void changeArray(int arr[], int i, int value) {
        if(i == arr.length) {
            print(arr);
            return;
        }

        arr[i] = value;
        changeArray(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }

    public static void print(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = new int[5];
            changeArray(arr, 0, 2);

            print(arr);

        } finally {
            sc.close();
        }

    }
}