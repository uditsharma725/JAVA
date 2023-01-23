import java.util.*;

public class qCheapestFlightK {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for(int i=0; i<flights.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Info {
        int vertex;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int flights[][], int n, int src, int dest, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dis[] = new int[n];
        for(int i=0; i<n; i++) {
            if(i != src) dis[i] = Integer.MAX_VALUE;
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops > k) break;

            for(int i=0; i<graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost+wt < dis[v] && curr.stops <= k) {
                    dis[v] = curr.cost+wt;
                    q.add(new Info(e.dest, dis[v], curr.stops+1));
                }
            }
        }
        
        if(dis[dest] == Integer.MAX_VALUE) return -1;
        else return dis[dest];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            int n=5, src=0, dest=3, k=1;
            int flights[][] = {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};

            int cost = cheapestFlight(flights, n, src, dest, k);
            System.out.print(cost);

        } finally {
            sc.close();
        }

    }
}