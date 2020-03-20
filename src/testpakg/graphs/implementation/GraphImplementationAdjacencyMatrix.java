package testpakg.graphs.implementation;

//https://algorithms.tutorialhorizon.com/graph-implementation-adjacency-matrix-set-3/

public class GraphImplementationAdjacencyMatrix {

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        addEdge(0, 1);
        addEdge(0, 4);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 3);
        addEdge(3, 4);
        printGraph(5);
    }

    static int mat[][];
    static int vert;
    static class Graph{
        Graph(int v){
            vert=v;
            mat=new int[v][v];
        }
    }

    static void addEdge(int src,int dest){
        mat[src][dest]=1;
        mat[dest][src]=1;
    }

    static void printGraph(int v){

        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j <v ; j++) {
                System.out.print(mat        [i][j]+ " ");
            }
            System.out.println();
        }


        for(int i=0;i<v;i++){
            System.out.println("vertex "+i+" is connected to ");
            for(int j=0;j<v;j++){
                if(mat[i][j]==1)
                System.out.println(": "+j);
            }
        }
    }
}
