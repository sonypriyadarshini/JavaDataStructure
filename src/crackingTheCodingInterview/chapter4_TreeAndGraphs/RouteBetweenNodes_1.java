package crackingTheCodingInterview.chapter4_TreeAndGraphs;
import java.util.*;

/*
Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a
route between two nodes.

https://www.geeksforgeeks.org/find-if-there-is-a-path-between-two-vertices-in-a-given-graph/
 */


public class RouteBetweenNodes_1 {

    //Graph Implementation: using adjacency matrix
    private LinkedList<Integer> linkedList[];
    private int vertices;

    RouteBetweenNodes_1(int v){
        vertices=v;
        linkedList=new LinkedList[v];
        for(int i=0;i<v;i++)
            linkedList[i]=new LinkedList<>();
    }

    void addToGraph(int element1,int element2){
        linkedList[element1].add(element2);
    }

    //Graph Search: BFS-queue, during this search if
    Iterator<Integer> integerIterator;
    boolean BFS(int element1, int element2){

        LinkedList<Integer>temp;
        boolean visit[]=new boolean[vertices];
        Queue<Integer> queue=new LinkedList<>();

        visit[element1]=true;
        queue.add(element1);
        while (queue.size()!=0){

            element1=queue.poll();
            int n;
            integerIterator=linkedList[element1].listIterator();
            while (integerIterator.hasNext()){
                n=integerIterator.next();
                if(n==element2)
                    return true;
                if(visit[n]==false){
                    visit[n]=true;
                    queue.add(n);
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        RouteBetweenNodes_1 g=new RouteBetweenNodes_1(4);
        g.addToGraph(0, 1);
        g.addToGraph(0, 2);
        g.addToGraph(1, 2);
        g.addToGraph(2, 0);
        g.addToGraph(2, 3);
        g.addToGraph(3, 3);
        Stack<Integer> stack=new Stack<>();
        int u = 1;
        int v = 3;
        if (g.BFS(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;

    }
}
