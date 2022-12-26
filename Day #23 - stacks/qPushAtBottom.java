import java.util.*;

public class qPushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                s.push(x);
            }

            int data = sc.nextInt();
            pushAtBottom(s, data);

            while(!s.isEmpty()) {
                System.out.println(s.pop());
            }

        } finally {
            sc.close();
        }

    }
}