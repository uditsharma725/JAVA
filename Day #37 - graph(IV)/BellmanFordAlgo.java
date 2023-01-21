import java.util.*;

public class BellmanFordAlgo {

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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
    
        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    } 

    public static void BF(ArrayList<Edge> graph[], int src) {
        int dis[] = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(i != src) dis[i] = Integer.MAX_VALUE;
        }

        int V = graph.length;
        for(int i=0; i<V-1; i++) {
            for(int j=0; j<graph.length; j++) {
                for(int k=0; k<graph[j].size(); j++) {
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if(dis[u] != Integer.MAX_VALUE && dis[u] + w < dis[v]) {
                        dis[v] = dis[u] + w;
                    }
                }
            }
        }

        for(int i=0; i<dis.length-1; i++) {
            System.out.print(dis[i] + " ");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[6];
            createGraph(graph);

            BF(graph, 0);

        } finally {
            sc.close();
        }

    }
}