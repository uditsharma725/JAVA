import java.util.*;

public class subArrSumBrute {

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

    public static void subArrSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int sum = 0;
                for(int z=i; z<=j; z++) {
                    sum += arr[z];
                }
                if(sum > max) max = sum;
                if(sum < min) min = sum;
            }
        }        
        
        System.out.println("Min sum = " + min);
        System.out.println("Max sum = " + max);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, sc);
            subArrSum(arr);

        } finally {
            sc.close();
        }

    }
}
/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/