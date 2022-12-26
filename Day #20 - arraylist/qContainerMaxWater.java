import java.util.*;

public class qContainerMaxWater {

    public static int maxWater(ArrayList<Integer> heights) {
        int water = 0;
        int l=0, r=heights.size()-1;

        while(l!=r) {
            int w = r-l;
            int h = Math.min(heights.get(l), heights.get(r));

            water = Math.max(water, (w*h));
            if(heights.get(l) < heights.get(r)) l++;
            else r--;
        }

        return water;
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

            System.out.print(maxWater(heights));

        } finally {
            sc.close();
        }

    }
}