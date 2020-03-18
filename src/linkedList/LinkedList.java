package linkedList;

public class LinkedList {

    //creating a linked list

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    Node head;
    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        linkedList.head=new Node(1);
        Node first = new Node(0);
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head.next=first;
        first.next=second;
        second.next=third;
        linkedList.printLinkedList(linkedList.head);
        linkedList.insertLinkList(second,new Node(8));
        linkedList.printLinkedList(first);
        System.out.println("lenght of linked list: "+linkedList.lengthLinkList(first));
        System.out.println("lenght of linked list: "+linkedList.lengthLinkListRecursive(first));

        linkedList.validateCircular();
    }

    //print linked list
    public void printLinkedList(Node node){
        Node n = node;
        System.out.println("Printing linked list\n");
        while(n!=null){
            System.out.println(+n.data+" ");
            n=n.next;
        }
    }

    //insert in a linked list
    public void insertLinkList(Node prev_node, Node new_node){
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    //length of a linked list in iterative way
    public int lengthLinkList(Node first_node){
        int count =0;
        while(first_node!=null)
        {
            count++;
            first_node=first_node.next;
        }
        return count;
    }

    //length of a linked list in recursive way
    public int lengthLinkListRecursive(Node first_node){
        if(first_node==null)
            return 0;
        return (1+lengthLinkListRecursive(first_node.next));
    }

    public void stackFromLinkedList(Node node){
        Node stacknode = node;

    }

    public void validateCircular(){
        Node n=head;
        while (n.next!=null&&n.next!=head){
            n=n.next;
        }

        if(n.next==head)
            System.out.println("circular at"+n.next.data);
        else
            System.out.println("not circular");

    }
}
