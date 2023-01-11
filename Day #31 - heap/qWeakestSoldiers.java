import java.util.*;

public class qWeakestSoldiers {

    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }
            else {
                return this.soldiers - r2.soldiers;
            } 
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int k = 2;
            int arr[][] = { {1, 0, 0, 0},
                            {1, 1, 1, 1},
                            {1, 0, 0, 0},                    
                            {1, 0, 0, 0}, };

            PriorityQueue<Row> pq = new PriorityQueue<>();

            for(int i=0; i<arr.length; i++) {
                int cnt = 0;
                for(int j=0; j<arr[i].length; j++) {
                    cnt += arr[i][j] == 1 ? 1 : 0;
                }
                pq.add(new Row(cnt, i));
            }

            for(int i=0; i<k; i++) {
                System.out.print(pq.peek().idx + " ");
                pq.remove();
            }

        } finally {
            sc.close();
        }

    }
}