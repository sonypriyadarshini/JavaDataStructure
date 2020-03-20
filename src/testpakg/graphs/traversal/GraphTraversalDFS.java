package testpakg.graphs.traversal;

//https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/

import java.util.Iterator;
import java.util.LinkedList;

public class GraphTraversalDFS {

    public static void main(String[] args) {
        GraphTraversalDFS g = new GraphTraversalDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.GraphTraversalDFS(2);
    }

    private int vert;
    private LinkedList<Integer> adjacencyList[];

    GraphTraversalDFS(int v){
        vert=v;
        adjacencyList=new LinkedList[v];

        for(int i=0;i<v;i++){
            adjacencyList[i]=new LinkedList<>();
        }
    }

    void addEdge(int src, int dest){
        adjacencyList[src].add(dest);
    }

    void GraphTraversalDFS(int n){
        boolean visited[]=new boolean[vert];
        for (int i=0; i<vert; ++i)
            if (visited[i] == false)
                trversalHelperDFS(visited,n);

    }

    void trversalHelperDFS(boolean visited[],int n){

        visited[n]=true;
        System.out.println(n);
        Iterator<Integer> iterator=adjacencyList[n].listIterator();
        while (iterator.hasNext()){
            int m=iterator.next();
            if(visited[m]!=true){
                trversalHelperDFS(visited,m);
            }
        }
    }
}
