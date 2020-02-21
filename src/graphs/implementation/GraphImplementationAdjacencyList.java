package graphs.implementation;

//https://www.geeksforgeeks.org/graph-and-its-representations/


import java.util.LinkedList;

public class GraphImplementationAdjacencyList {

    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        printGraph(graph);
    }

    static class Graph{

        LinkedList<Integer> adjacencyList[];
        int vert;

        Graph(int v){
            vert=v;
            adjacencyList=new LinkedList[vert];

            for(int i=0;i<vert;i++){
                adjacencyList[i]=new LinkedList<>();
            }
        }
    }

    static void addEdge(Graph graph,int src,int dest){
        graph.adjacencyList[src].add(dest);
        graph.adjacencyList[dest].add(src);
    }

    static void printGraph(Graph graph){
        for(int i=0;i<graph.vert;i++){
            System.out.println("Adjacency list of vertex "+ i);
            for(Integer k:graph.adjacencyList[i])
                System.out.println(k);
        }
    }
}
