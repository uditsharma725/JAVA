import java.util.*;

public class insertHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int i = arr.size()-1;
            int p = (i-1)/2;

            while(arr.get(i) < arr.get(p)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(p));
                arr.set(p, temp);

                i = p;
                p = (i-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            

        } finally {
            sc.close();
        }

    }
}