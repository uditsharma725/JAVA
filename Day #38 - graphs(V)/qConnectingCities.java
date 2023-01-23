import java.util.*;

public class qConnectingCities {

    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost;
        }
    }

    public static int connectCities(int cities[][]) {
        int finalCost = 0;

        boolean vis[] = new boolean[cities.length];
        PriorityQueue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(0, 0));

        while(!q.isEmpty()) {
            Edge curr = q.remove();
            if(!vis[curr.dest]) {
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for(int i=0; i<cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i] != 0) {
                        q.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }

        return finalCost;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int cities[][] = {  {0,1,2,3,4},
                                {1,0,5,0,7},
                                {2,5,0,6,0},
                                {3,0,6,0,0},
                                {4,7,0,0,0} };
            
            int cost = connectCities(cities);
            System.out.print(cost);

        } finally {
            sc.close();
        }

    }
}