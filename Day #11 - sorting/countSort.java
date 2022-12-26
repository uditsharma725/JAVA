import java.util.*;

public class countSort {

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

    public static void countS(int arr[]) {
        
        // finding the largest number:
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) max = Math.max(max, arr[i]);

        // storing the count of each element in the count array:
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++) count[arr[i]]++;

        // sorting the array here:
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, sc);

            countS(arr);
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