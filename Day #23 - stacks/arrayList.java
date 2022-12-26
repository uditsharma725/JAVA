import java.util.*;

public class arrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public void peek() {
           System.out.println( list.get(list.size() - 1));
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                s.push(x);
            }

            while(!s.isEmpty()) {
                s.peek();
                s.pop();
            }

        } finally {
            sc.close();
        }

    }
}