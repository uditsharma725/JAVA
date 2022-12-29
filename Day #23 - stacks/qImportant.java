import java.util.*;

public class qImportant {

    public static int maxArea(ArrayList<Integer> nums) {
        int area = -1;

        Stack<Integer> s = new Stack<>();
        int left[] = new int[nums.size()];
        int right[] = new int[nums.size()];

        // right smaller:
        for(int i=0; i<nums.size(); i++) {
            while(!s.empty() && nums.get(i)<nums.get(s.peek())) {
                right[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }
        while(!s.empty()) {
            right[s.peek()] = nums.size()-1;
            s.pop();
        }

        // left smaller:
        for(int i=nums.size()-1; i>=0; i--) {
            while(!s.empty() && nums.get(i)<nums.get(s.peek())) {
                left[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }
        while(!s.empty()) {
            left[s.peek()] = 0;
            s.pop();
        }

        // finding maximum area:
        for(int i=0; i<nums.size(); i++) {
            int h = nums.get(i);
            int w = right[i] - left[i] - 1;

            area = Math.max(area, (h*w));
        }

        return area;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            ArrayList<Integer> heights = new ArrayList<>();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                heights.add(x);
            }

            System.out.print(maxArea(heights));

        } finally {
            sc.close();
        }

    }
}