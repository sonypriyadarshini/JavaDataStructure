package graphs;

//https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

import com.sun.org.apache.xpath.internal.operations.Bool;

public class DijkstrasAlgorithmGreedymethod {

    static int V=9;
    static void dijkstras(int mat[][], int src){
        int dist[]=new int[V];

    }

    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
    }

    int minDistance(int dist[], Boolean visit[]){
        int min=Integer.MAX_VALUE,min_index=0;
        for(int i=0;i<V;i++){
            if(dist[i]<min)
            {
                min=dist[i];
                min_index=i;
            }
        }
        return min_index;
    }
}
