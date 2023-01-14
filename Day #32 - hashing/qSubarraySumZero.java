import java.util.*;

public class qSubarraySumZero {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
            HashMap<Integer, Integer> m = new HashMap<>();

            int sum = 0, len = 0;
            for(int i=0; i<arr.length; i++) {
                sum += arr[i];
                if(m.containsKey(sum)) {
                    len = Math.max(len, i - m.get(sum));
                }
                else m.put(sum, i);
            }

            System.out.print(len);

        } finally {
            sc.close();
        }

    }
}