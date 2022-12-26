import java.util.*;

public class lastOccurence {

    public static int occur(int arr[], int key, int i) {
        if(i == 0) return -1;
        if(arr[i] == key) return i;

        return occur(arr, key, i-1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            int key = sc.nextInt();
            
            System.out.print(occur(arr, key, arr.length-1));            

        } finally {
            sc.close();
        }

    }
}