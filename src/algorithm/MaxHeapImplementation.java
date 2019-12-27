package algorithm;

public class MaxHeapImplementation {

    int Heap[];
    int size;
    int max;

    MaxHeapImplementation(int max){
        this.max=max;
        Heap=new int[max+1];
        size=0;
        Heap[0]=Integer.MAX_VALUE;
    }

    void insertToHeap(int val){
        size++;
        Heap[size]=val;
        int current=size;
        while(Heap[current]>Heap[current/2]){
            swap(current,current/2);
            current=current/2;
        }
    }

    int deleteFromHeap(){
        int pop= Heap[1];
        Heap[1]=Heap[size];
        size--;
        int pos=1;
        while(pos<size-2){
        if(Heap[pos]<Heap[pos*2]||Heap[pos]<Heap[pos*2 + 1]){
            if (Heap[pos*2]>Heap[pos*2+1]){
                swap(pos,pos*2);
                pos=pos*2;
            }
            else {
                swap(pos,pos*2+1);
                pos=pos*2+1;
            }
        }
        else
            break;
        }
        return pop;
    }

    void swap(int cur, int root){
        int temp=Heap[cur];
        Heap[cur]=Heap[root];
        Heap[root]=temp;
    }

    public static void main(String[] args) {
        int ar[]={5,3,17,10,84,19,6,22,9};
        MaxHeapImplementation maxHeapImplementation=new MaxHeapImplementation(ar.length);
        for(int i:ar){
            maxHeapImplementation.insertToHeap(i);
        }
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());
        System.out.println(maxHeapImplementation.deleteFromHeap());

    }
}
