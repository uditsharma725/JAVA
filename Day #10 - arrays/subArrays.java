import java.util.*;

public class subArrays {

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

    public static void subArrr(int arr[]) {

        int ts = 0;
        //the 1st loop will define the starting number
        for(int i=0; i<arr.length; i++) {
            int start = i;

            //the second loop will define the ending number
            for(int j=i; j<arr.length; j++) {
                int end = j;

                /*  the third loop is only to print numbers between 
                the starting point and the ending point in array  */
                
                for(int z=start; z<=end; z++) {
                    System.out.print(arr[z] + " ");
                }

                ts++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.print("total subarrays = " + ts);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int size = sc.nextInt();
            int arr[] = new int[size];
            input(arr, sc);

            subArrr(arr);

        } finally {
            sc.close();
        }

    }
}
/*
print(arr, size) - print an array
input(arr, size, sc) - input an array
*/