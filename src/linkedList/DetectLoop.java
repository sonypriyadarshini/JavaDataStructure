package linkedList;

import java.util.HashSet;

public class DetectLoop {
    Node head;

    public static void main(String args[]) {
        DetectLoop linklist = new DetectLoop();
        linklist.head = new Node(1);
        linklist.head.next = new Node(2);
        linklist.head.next.next = new Node(3);
        linklist.head.next.next.next = new Node(4);
        linklist.head.next.next.next.next = new Node(5);
        linklist.head.next.next.next.next.next = new Node(6);
        linklist.head.next.next.next.next.next.next = linklist.head.next;

        linklist.detectLoop(linklist.head);
        linklist.loopUsingPointers(linklist.head);
    }

    //using hashing
    public void detectLoop(Node node) {
        HashSet<Node> hashSet = new HashSet<>();
        while (node != null) {
            if (hashSet.contains(node)) {
                System.out.println("loop : " + node.data);
                return;
            }
            hashSet.add(node);
            node = node.next;
        }
    }

    //using 2 pointers
    public void loopUsingPointers(Node node) {
        Node slow_ptr = node, fast_ptr = node;
        while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if (slow_ptr == fast_ptr) {
                System.out.println("loop found!! " + fast_ptr.data);
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
