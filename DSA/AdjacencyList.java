package DSA;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        graphImple var = new graphImple();
        var.addEdge();
        var.findNeighbor(2);
    }

}

class graphImple {
    class Edge {
        int src;
        int dest;
        int wgt;

        Edge(int src, int dest, int wgt) {
            this.src = src;
            this.dest = dest;
            this.wgt = wgt;
        }
    }

    int n = 4;
    ArrayList<Edge> graph[] = new ArrayList[n];

    void addEdge() {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, -1));
        graph[2].add(new Edge(2, 1, 10));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    void findNeighbor(int n) {
        System.out.println("Neighbour of " + n + " are : ");
        System.out.println("Neighbour and weight");
        for (int i = 0; i < graph[n].size(); i++) {
            Edge e = graph[n].get(i);
            System.out.println(e.dest + " , " + e.wgt);
        }
    }
}
