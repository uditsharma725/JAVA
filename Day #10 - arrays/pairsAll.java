import java.util.*;

public class pairsAll {

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

    public static void printPairs(int arr[]) {

        int cnt = 0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("("+ arr[i] + "," + arr[j] + ") ");
                cnt++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + cnt + " (using count)");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            input(arr,sc);
            
            printPairs(arr);
            System.out.print("Total pairs = " + ((arr.length*(arr.length-1))/2) + " (using formula)");

        } finally {
            sc.close();
        }

    }
}
/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/