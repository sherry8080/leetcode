package graph;

public class Driver {
    public static void main(String[] args){
        int v = 5;
        int e = 10;

        BellmanFord graph = new BellmanFord(v, e);

        graph.edge[0].s = 0;
        graph.edge[0].t = 4;
        graph.edge[0].weight = 6;

        graph.edge[1].s = 0;
        graph.edge[1].t = 2;
        graph.edge[1].weight = 7;

        graph.edge[2].s = 4;
        graph.edge[2].t = 1;
        graph.edge[2].weight = 5;

        graph.edge[3].s = 4;
        graph.edge[3].t = 2;
        graph.edge[3].weight = 8;

        graph.edge[4].s = 4;
        graph.edge[4].t = 3;
        graph.edge[4].weight = -5;

        graph.edge[5].s = 1;
        graph.edge[5].t = 4;
        graph.edge[5].weight = -2;

		/*graph.edge[6].s = 2;
		graph.edge[6].t = 1;
		graph.edge[6].weight = -3;*/

        graph.edge[6].s = 2;
        graph.edge[6].t = 1;
        graph.edge[6].weight = -2;

        graph.edge[7].s = 2;
        graph.edge[7].t = 3;
        graph.edge[7].weight = 9;

        graph.edge[8].s = 3;
        graph.edge[8].t = 1;
        graph.edge[8].weight = 7;

        graph.edge[9].s = 3;
        graph.edge[9].t = 0;
        graph.edge[9].weight = 2;


        graph.bellman(graph, 0);
    }
}
