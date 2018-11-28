
package graph;

import java.util.*;

public class FriendCircle {


    //dfs
    /*public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }*/


    //bfs
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < M.length; i++) {
            if(visited[i] == 0){
                queue.add(i);
                count++;
                while(!queue.isEmpty()){
                    int tmp = queue.remove();
                    visited[tmp] = 1;
                    for (int j = 0; j < M.length; j++) {
                        if (M[tmp][j] == 1 && visited[j] == 0)
                            queue.add(j);
                    }
                }
            }
        }
        return count;
    }
}

