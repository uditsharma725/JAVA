import java.util.*;

public class qReverseStack {
   
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.empty()) return;

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
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

            reverse(s); 
            while(!s.empty()) System.out.println(s.pop());

        } finally {
            sc.close();
        }

    }
}