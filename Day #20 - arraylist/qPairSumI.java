import java.util.*;

public class qPairSumI {

    public static boolean found(ArrayList<Integer> nums, int target) {
        int l=0, r=nums.size()-1;
        
        while(l!=r) {
            int sum = nums.get(l)+nums.get(r);
            if(sum == target) return true;

            if(sum > target) r--;
            else l++;
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                nums.add(x);
            }           
            int target = sc.nextInt();
            

            if(found(nums, target)) System.out.print("YES");
            else System.out.print("NO");

        } finally {
            sc.close();
        }

    }
}