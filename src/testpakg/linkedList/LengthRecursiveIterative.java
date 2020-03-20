package testpakg.linkedList;

public class LengthRecursiveIterative {
    public static void main(String args[]){
        LengthRecursiveIterative linklist=new LengthRecursiveIterative();
        linklist.head=new Node(3);
        linklist.head.next=new Node(67);
        linklist.head.next.next=new Node(73);
        linklist.head.next.next.next=new Node(39);
        linklist.findLengthIterative(linklist.head);
        System.out.println("recursive length "+linklist.findLengthRecursive(linklist.head));
    }

    public void findLengthIterative(Node node){
        Node temp =node;
        int count=0;
        if(temp==null) {
            System.out.println("count is "+count);
            return;
        }

        while(temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println("count is "+count);
    }

    public int findLengthRecursive(Node node){
        Node temp =node;
        if(node==null) {
            return 0;
        }
        return 1+findLengthRecursive(node.next);

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
