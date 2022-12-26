import java.util.*;

public class subArrSumPrefix {

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

    public static int subArrSum(int arr[]) {
        
        // calculating prefix sum:
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i<arr.length; i++) prefix[i] = prefix[i-1]+arr[i];

        // calculating max subArraysum using prefix sum:
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int sum = (i == 0 ? prefix[j] : prefix[j] - prefix[i-1]);
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr, sc); 

            int max = subArrSum(arr);
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