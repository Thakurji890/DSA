package DSA;

import java.util.ArrayList;

public class Graph {
    public static void main(String[] args) {
        GraphImplementation var = new GraphImplementation();
        var.addingEdge();
        var.findNeighbor(0);
    }

}

class GraphImplementation {
    int ver = 4;
    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[] = new ArrayList[ver];

    class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    void addingEdge() {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>(); // this loop is important
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    void findNeighbor(int n) {
        System.out.print("Neighbour of " + n + " are : ");
        for (int i = 0; i < graph[n].size(); i++) {
            Edge e = graph[n].get(i);
            System.out.print(e.dest + " ");
        }
    }
}