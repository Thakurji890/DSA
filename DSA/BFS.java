package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        graph var = new graph();
        var.addEdge();

        var.bfs();
        System.out.println();
        var.dfs(var.graph, 0, new boolean[7]);
        System.out.println();

    }

}

class graph {
    class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    int n = 7;
    ArrayList<Edge> graph[] = new ArrayList[n];

    void addEdge() {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // void print(int n) {
    // for (int i = 0; i < graph[n].size(); i++) {
    // Edge e = graph[n].get(i);
    // System.out.print(e.dest + " ");
    // }
    // }

    void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.add(0);

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            if (visited[curr] == false) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }

    void dfs(ArrayList<Edge> graph[], int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (visited[e.dest] == false)
                dfs(graph, e.dest, visited);
        }
    }

    void allPaths() {
        // All paths from source to destination
        // src = 0 , tar = 5

        // using modified dfs

    }
}
