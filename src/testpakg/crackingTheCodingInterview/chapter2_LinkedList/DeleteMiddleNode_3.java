package testpakg.crackingTheCodingInterview.chapter2_LinkedList;

public class DeleteMiddleNode_3 {

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    static void deleteMiddleNode(Node n){
        Node prev=null;
        while(n!=null){
            n.data=n.next.data;
            prev=n;
            n=n.next;
        }
        prev.next=null;
    }
}
