package testpakg.crackingTheCodingInterview.chapter3_StacksAndQueues;

//https://www.geeksforgeeks.org/efficiently-implement-k-stacks-single-array/
//youtube.com/watch?v=S5cYO9k1Ja8


public class ArrayToThreeStacks {

    int ar[];
    int top[];
    int next[];
    int k,n,free;

    ArrayToThreeStacks(int n1,int sn1){

        k = sn1;
        n = n1;
        ar = new int[n];
        top = new int[k];
        next = new int[n];
        for(int i=0;i<sn1;i++)
            top[i]=-1;
        for(int i=0;i<n-1;i++)
            next[i]=i+1;
        next[n-1]=-1;
        free=0;
    }

    void push(int ele, int sn){
        if(free==-1)
            return;
        int i=free;
        free=next[i];
        next[i]=top[sn];
        top[sn]=i;
        ar[i]=ele;
    }

    int pop(int sn){
        if(top[sn]==-1)
            return -1;
        int i=top[sn];
        top[sn]=next[i];
        next[i]=free;
        free=i;
        return ar[i];
    }
    public static void main(String[] args) {

    ArrayToThreeStacks arrayToThreeStacks=new ArrayToThreeStacks(5,3);
        arrayToThreeStacks.push(10,1);
        arrayToThreeStacks.push(13,1);
        arrayToThreeStacks.push(100,0);
        arrayToThreeStacks.push(103,0);
        System.out.println(arrayToThreeStacks.pop(0));
        System.out.println(arrayToThreeStacks.pop(1));
    }
}
