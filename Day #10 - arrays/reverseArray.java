import java.util.*;

/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/

public class reverseArray {

    // print array function:
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // input array function:
    public static void input(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }

    public static void arrReverse(int arr[]) {
        int s = 0;
        int e = arr.length-1;
        while(s != e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++; e--;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int size = sc.nextInt();
            int arr[] = new int[size];
            input(arr, sc);
            
            arrReverse(arr);
            print(arr);

        } finally {
            sc.close();
        }

    }
}
