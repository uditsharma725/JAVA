import java.util.*;

public class dijkastraAlgo {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    } 

    static class Pair implements Comparable<Pair> {
        int node;
        int path;

        Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p) {
            return this.path - p.path;
        }
    }

    public static void dijkastra(ArrayList<Edge> graph[], int src) {
        int dis[] = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(i != src) dis[i] = Integer.MAX_VALUE;
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0, 0));

        while(!q.isEmpty()) {
            Pair curr = q.remove();
            if(!vis[curr.node]) {
                vis[curr.node] = true;
                for(int i=0; i<graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if(dis[u]+w < dis[v]) {
                        dis[v] = dis[u] + w;
                        q.add(new Pair(v, dis[v]));
                    }
                }
            }
        }

        for(int i=0; i<dis.length; i++) {
            System.out.print(dis[i] + " ");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[6];
            createGraph(graph);

            dijkastra(graph, 0);

        } finally {
            sc.close();
        }

    }
}