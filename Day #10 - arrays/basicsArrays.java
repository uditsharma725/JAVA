import java.util.*;;

public class basicsArrays {
    public static int[] addOne(int arr[], int size) {
        for(int i=0; i<size; i++) arr[i] += 1;
        return arr;
    }
    public static void main(String args[]) {
        /*  dataType name = newKeyword dataType[size];  */
        // int marks[] = new int[50];
        // int numbers[] = {1,2,3,4};
        // String fruits[] = {"a", "b", "c"};

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size - ");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.println("Enter the arr values");
            for(int i=0; i<size; i++) arr[i] = sc.nextInt();

            System.out.println("Arr values :");
            for(int i=0; i<size; i++) System.out.println("index - " + i + " value - " + arr[i]);

            int arr2[] = new int[size];
            arr2 = addOne(arr, size);
            System.out.println("Updatede value: ");
            for(int i=0; i<size; i++) System.out.print(arr2[i] + " ");

        } finally { sc.close(); }
    }
}