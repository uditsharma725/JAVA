import java.util.*;

public class qInterLeaveQueue {

    public static Queue<Integer> interLeave(Queue<Integer> q1, int n) {
        Queue<Integer> ans = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=0; i<n/2; i++) {
            q2.add(q1.peek());
            q1.remove();
        }

        for(int i=0; i<n/2; i++) {
            ans.add(q2.peek()); q2.remove();
            ans.add(q1.peek()); q1.remove();
        }

        return ans;
    }

    public static void main(String args[]) {

        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                q.add(x);
            }

            Queue<Integer> interLeaved = interLeave(q, n);
            while(!interLeaved.isEmpty()) {
                System.out.print(interLeaved.peek() + " ");
                interLeaved.remove();
            }

        } finally {
            sc.close();
        }

    }
}