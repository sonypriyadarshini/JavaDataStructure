package linkedList;

import java.util.HashSet;

public class DetectLoop {
    Node head;

    public static void main(String args[]) {
        DetectLoop linklist = new DetectLoop();
        linklist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linklist.head.next = second;
        second.next = third;
        third.next=fourth;
        fourth.next=second;
        linklist.detectLoop(linklist.head);
        linklist.loopUsingPointers(linklist.head);
    }

    //using hashing
    public void detectLoop(Node node) {
        HashSet<Node> hashSet = new HashSet<>();
        while(node!=null){
//            System.out.println("entered, node : " + node.data);

            if (hashSet.contains(node)){
                System.out.println("loop : " + node.data);
                return;
            }
            hashSet.add(node);
            node = node.next;
//            System.out.println("node : " + node.data);
        }
    }

    //using 2 pointers
    public void loopUsingPointers(Node node) {
        Node slow_ptr =node, fast_ptr =node;
        while(slow_ptr!=null&&fast_ptr!=null&&fast_ptr.next!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if(slow_ptr==fast_ptr){
                System.out.println("loop found!! "+fast_ptr.data);
                return;
            }

        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

}
