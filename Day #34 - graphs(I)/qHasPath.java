import java.util.*;

public class qHasPath {

    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5,1));
    } 

    public static boolean hasPath(ArrayList<Edge> graph[], int s, int d, boolean vis[]) {
        if(s == d) return true;

        vis[s] = true;
        for(int i=0; i<graph[s].size(); i++) {
            Edge e = graph[s].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, d, vis)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[7];
            createGraph(graph);

            boolean vis[] = new boolean[7];
            System.out.print(hasPath(graph, 0, 5, vis));

        } finally {
            sc.close();
        }

    }
}