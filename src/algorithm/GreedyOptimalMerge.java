package algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/optimal-file-merge-patterns/

public class GreedyOptimalMerge {

    public static void main(String[] args) {
        int a[]=new int[]{ 7,5,2, 3, 4, 6};
        Arrays.sort(a);
        System.out.println(optimalMerge(6,a));
    }

    static int optimalMerge(int size, int ar[]){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue();
        for(int i=0;i<size;i++){
            priorityQueue.add(ar[i]);
        }
        int count=0,temp;
        while (priorityQueue.size()>1){
            temp=priorityQueue.poll()+priorityQueue.poll();
            count+=temp;
            priorityQueue.add(temp);
        }
        return count;
    }
}
