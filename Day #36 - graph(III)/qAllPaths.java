import java.util.*;

public class qAllPaths {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));        
    } 

    public static void paths(ArrayList<Edge> graph[], int s, int d, String path) {
        if(s == d) {
            System.out.println(path + d);
            return;
        }

        for(int i=0; i<graph[s].size(); i++) {
            Edge e = graph[s].get(i);
            paths(graph, e.dest, d, path + s);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[7];
            createGraph(graph);

            paths(graph, 5, 1, "");

        } finally {
            sc.close();
        }

    }
}