package testpakg.linkedList;

public class PrintMiddle {
    public static void main(String args[]){
        PrintMiddle linkList = new PrintMiddle();
        linkList.head = new Node(32);
        Node second = new Node(33);
        Node third = new Node(34);
        linkList.head.next=second;
        second.next=third;
        linkList.findMiddle(linkList.head);
        linkList.findMid(linkList.head);
    }

    //using 2 pointers
    public void findMiddle(Node node){
       Node slow_ptr =node, fast_ptr =node;
        while(fast_ptr!=null&&fast_ptr.next!=null){
            slow_ptr= slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
        }
        System.out.println("middle "+slow_ptr.data);
    }

    //another method, moving mid only when count is odd
    public void findMid(Node node){
        Node mid = node;
        int count=0;
        while (node!=null) {
            if (count % 2 == 1) {
                mid = mid.next;
            }
            count++;
            node = node.next;
        }
        System.out.println("mid is "+mid.data);

    }

    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
}
