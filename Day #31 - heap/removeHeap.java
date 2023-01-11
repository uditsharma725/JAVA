import java.util.*;

public class removeHeap {

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

        private void heapify(int i) {
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(left) < arr.get(minIdx)) minIdx = left;
            if(right < arr.size() && arr.get(right) < arr.get(minIdx)) minIdx = right;
            
            if(minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {

        Heap h = new Heap();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                h.add(x);
            }

            while(!h.isEmpty()) {
                System.out.print(h.peek() + " ");
                h.remove();
            }

        } finally {
            sc.close();
        }

    }
}