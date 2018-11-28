//An Iterative Java program to do DFS traversal from
//a given source vertex. DFS(int s) traverses vertices
//reachable from s.
package graph;
import java.util.*;

public class DFS {
    static class Graph {
        int V; //Number of Vertices

        LinkedList<Integer>[] adj; // adjacency lists

        Graph(int V) {
            this.V = V;
            adj = new LinkedList[V];

            for (int i = 0; i < adj.length; i++)
                adj[i] = new LinkedList<Integer>();

        }

        void addEdge(int v, int w)
        {
            adj[v].add(w); // Add w to v’s list.
        }

        void recursive(boolean[] visited, int n){
            for(int i = 0; i < adj.length; i++){
                if(visited[i] == false){
                    visited[i] = true;
                    System.out.print(" " + i);
                    recursive(visited, i);
                }
            }
        }

        void recursive_matrix(int[][] m, boolean[] visited, int n){
            for(int i = 0; i < m[i].length; i++){
                if(visited[i] == false){
                    visited[i] = true;
                    System.out.print(" " + i);
                    recursive_matrix(m, visited, i);
                }
            }
        }


        // prints all not yet visited vertices reachable from s
        void iterate(int s){
            // Initially mark all vertices as not visited
            Vector<Boolean> visited = new Vector<Boolean>(V);
            for (int i = 0; i < V; i++)
                visited.add(false);

            // Create a stack for DFS
            Stack<Integer> stack = new Stack<>();

            // Push the current source node
            stack.push(s);

            while(stack.empty() == false) {
                // Pop a vertex from stack and print it
                s = stack.peek();
                stack.pop();

                if(visited.get(s) == false){
                    System.out.print(s + " ");
                    visited.set(s, true);
                }

                Iterator<Integer> itr = adj[s].iterator();

                while (itr.hasNext()) {
                    int v = itr.next();
                    if(!visited.get(v))
                        stack.push(v);
                }

            }
        }
    }

    // Driver program to test methods of graph class
    public static void main(String[] args)
    {
        // Total 5 vertices in graph
        Graph g = new Graph(5);

        /*g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);*/

        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(3, 2);
        g.addEdge(2, 4);

        System.out.println("Following is the Depth First Traversal");
        g.iterate(0);
        System.out.println();

        boolean[] visited = new boolean[5];
        for (int i = 0; i < 5; i++)
            visited[i] = false;

        g.recursive(visited, 0);

    }
}
