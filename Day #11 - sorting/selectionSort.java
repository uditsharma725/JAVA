import java.util.*;

public class selectionSort {

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

    public static void selection(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                /*  if we found a element smaller than the
                current element we would update the minPos  */
                if(arr[minPos] > arr[j]) minPos = j;
            }
            
            /*  we would swap the elements in the outer loop  */
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int size = sc.nextInt();
            int arr[] = new int[size];
            input(arr, sc);

            selection(arr);
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