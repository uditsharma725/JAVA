import java.util.*;

public class PrimAlgo {

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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    } 

    static class Pair implements Comparable<Pair> {
        int v, c;
        Pair(int v, int c) {
            this.v = v;
            this.c = c;
        }

        @Override
        public int compareTo(Pair p) {
            return this.c - p.c;
        }
    }

    public static int prims(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0, 0));
        int cost = 0;

        while(!q.isEmpty()) {
            Pair curr = q.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                cost += curr.c;

                for(int i=0; i<graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    q.add(new Pair(e.dest, e.wt));
                }
            }
        }

        return cost;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[4];
            createGraph(graph);

            System.out.print(prims(graph));

        } finally {
            sc.close();
        }

    }
}