import java.util.*;

public class qSpan {

    public static int span(ArrayList<Integer> nums) {
        int mx = -1;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> index = new Stack<>();
        for(int i=0; i<nums.size(); i++) {
            while(!index.empty() && nums.get(i)>=nums.get(index.peek())) index.pop();
            if(index.empty()) span.add(i+1);
            else span.add(i-index.peek()); 
            index.push(i);
        }

        for(int i=0; i<span.size(); i++) mx = Math.max(span.get(i), mx);
        return mx;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            ArrayList<Integer> prices = new ArrayList<>();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                prices.add(x);
            }
            System.out.print(span(prices));

        } finally {
            sc.close();
        }

    }
}