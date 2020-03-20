package testpakg.graphs.traversal;

//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversalBFS {

    public static void main(String[] args) {
        GraphTraversalBFS g = new GraphTraversalBFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.traversalBFS(2);
    }

    private int vert;
    private LinkedList<Integer> adjacencyList[];

    GraphTraversalBFS(int v){
            vert=v;
            adjacencyList=new LinkedList[v];

            for(int i=0;i<v;i++){
                adjacencyList[i]=new LinkedList<>();
            }
        }
    void addEdge(int src,int dest){
        adjacencyList[src].add(dest);
    }

    void traversalBFS(int n){
        boolean visited[]=new boolean[vert];
        Queue<Integer> queue=new LinkedList<>();

        visited[n]=true;
        queue.add(n);
        while (queue.size()!=0){
            int k=queue.poll();
            System.out.println(k);

            Iterator<Integer> iterator=adjacencyList[k].listIterator();
            while (iterator.hasNext()){
                int d=iterator.next();
                if(visited[d]!=true){
                    queue.add(d);
                    visited[d]=true;
                }
            }
        }

    }
}
