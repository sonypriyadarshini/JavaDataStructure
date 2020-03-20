package testpakg.linkedList;

public class Insertion {

    public static void main(String args[]){
        Insertion linkedListInsertion = new Insertion();
        Node first = new Node(20);
        Node second = new Node(42);
        Node third = new Node(23);
        first.next=second;
        second.next=third;
        linkedListInsertion.insert(second, new Node(78));
        linkedListInsertion.print(first);
    }

    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public void insert(Node prev_node, Node new_node){
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    public void print(Node first_node){
        Node n = first_node;
        System.out.println("Printing linked list\n");
        while(n!=null){
            System.out.println(+n.data+" ");
            n=n.next;
        }
    }

}
