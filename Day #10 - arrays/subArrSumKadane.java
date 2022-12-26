import java.util.*;

public class subArrSumKadane {

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

    public static int kadaneAlgo(int arr[]) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;

        // Kadane's ALgo:
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
            if(sum > 0) {
                max = Math.max(max, sum);
            }
            else sum = 0;
        }

        // condition if all the integers are negative:
        if(max == Integer.MIN_VALUE) 
        for(int i=0; i<arr.length; i++) max = Math.max(max, arr[i]);

        return max;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, sc);
            
            int max = kadaneAlgo(arr);
            System.out.print(max);

        } finally {
            sc.close();
        }

    }
}
/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/