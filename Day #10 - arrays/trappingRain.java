import java.util.*;

public class trappingRain {

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

    public static int trapRain(int arr[]) {

        int water = 0;
        if (arr.length > 2) {

            // calc highest bar on left side of current bar:
            int left[] = new int[arr.length];
            left[0] = arr[0];
            for (int i = 1; i < arr.length; i++) left[i] = Math.max(left[i - 1], arr[i]);

            // calc highest bar on right side of current bar:
            int right[] = new int[arr.length];
            right[arr.length-1] = arr[arr.length-1];
            for (int i=arr.length-2; i>=0; i--) right[i] = Math.max(right[i + 1], arr[i]);

            // calc water collected:
            for(int i=0; i<arr.length; i++) {
                water += (Math.min(left[i], right[i]) - arr[i]);
            }

        }   

        return water;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, sc);

            int water = trapRain(arr);
            System.out.print(water);

        } finally {
            sc.close();
        }

    }
}
/*
 * print(arr, size) - print an array
 * input(arr, size, sc) - input an array
 */