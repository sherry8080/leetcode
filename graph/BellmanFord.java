package graph;

public class BellmanFord{

    class Edge {
        int s, t, weight;
        Edge() {
            s = t = weight = 0;
        }
    }

    int vertices, edges;
    Edge[] edge;

    public BellmanFord(int v, int e){
        vertices = v;
        edges = e;
        edge = new Edge[edges];
        for (int i = 0; i < edges; ++i)
            edge[i] = new Edge();
    }

    public void bellman(BellmanFord graph,int s){

        int dist[] = new int[vertices];
        dist[0] = 0;
        for (int i = 1; i < vertices; i++)
            dist[i] = Integer.MAX_VALUE;

        for (int i = 1; i < vertices; i++){
            for (int j = 0; j < edges; j++){
                int u = graph.edge[j].s;
                int v = graph.edge[j].t;
                int weight = graph.edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                    dist[v] = dist[u] + weight;
            }
        }

        for (int j = 0; j < edges; ++j){
            int u = graph.edge[j].s;
            int v = graph.edge[j].t;
            int weight = graph.edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && ((dist[u] + weight) < dist[v]))
                System.out.println("Graph contains negative weight cycle");
        }
        display(dist);
    }

    public void display(int dist[]){
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < vertices; i++)
            System.out.println(i + "\t" + dist[i]);
    }

}