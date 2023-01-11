import java.util.*;

public class qSilidingWindow {

    static class Window implements Comparable<Window> {
        int val;
        int idx;

        public Window(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Window w) {
            return w.val - this.val;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;

            PriorityQueue<Window> pq = new PriorityQueue<>();
            for(int i=0; i<k; i++) pq.add(new Window(arr[i], i));

            int res[] = new int[arr.length-k+1];
            res[0] = pq.peek().val;

            for(int i=k; i<arr.length; i++) {
                while(pq.size()>0 && pq.peek().idx<=(i-k)) pq.remove();

                pq.add(new Window(arr[i], i));
                res[i-k+1] = pq.peek().val;
            }

            for(int i=0; i<res.length; i++) System.out.print(res[i] + " ");

        } finally {
            sc.close();
        }

    }
}