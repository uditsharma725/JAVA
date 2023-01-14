import java.util.*;

public class qSubarraySumK {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {10, 2, -2, 20, 10};
            int k = -10;

            HashMap<Integer, Integer> m = new HashMap<>();
            m.put(0,1);

            int sum = 0, cnt = 0;
            for(int i=0; i<arr.length; i++) {
                sum += arr[i];
                if(m.containsKey(sum-k)) {
                    cnt += m.get(sum-k);
                }
                m.put(sum, m.getOrDefault(sum, 0) + 1);
            }

            System.out.print(cnt);

        } finally {
            sc.close();
        }

    }
}