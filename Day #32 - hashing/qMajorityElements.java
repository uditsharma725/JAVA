import java.util.*;

public class qMajorityElements {

    public static ArrayList<Integer> majority(int nums[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(m.containsKey(nums[i])) m.put(nums[i], m.get(nums[i])+1);
            else m.put(nums[i], 1);
        }

        Set<Integer> keys = m.keySet();
        for(Integer key:keys) if(m.get(key) > n) ans.add(key);

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int nums[] = {1, 3, 3, 5, 1, 3, 1, 3, 1};
            int n = nums.length/3;

            ArrayList<Integer> arr = majority(nums, n);
            for(Integer i:arr) System.out.print(i + " ");

        } finally {
            sc.close();
        }

    }
}