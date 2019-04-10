package linkedList;

public class Reverse {
    public static void main(String args[]){
        Reverse linkList = new Reverse();
        linkList.head = new Node(32);
        Node second = new Node(33);
        Node third = new Node(34);
        linkList.head.next=second;
        second.next=third;
        linkList.printLinkedList(linkList.head);

       Node n =  linkList.reverseIterative(linkList.head);
        linkList.printLinkedList(n);
        linkList.reverseRecursive(linkList.head);
        linkList.printLinkedList(linkList.head);

    }

    //iterative
    public Node reverseIterative(Node node){
        Node curr=node,next=null, prev=null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node=prev;
        return node;
    }

    //recursive
    public void reverseRecursive(Node node){

        if(node==null){
            return;
        }
        Node curr=node,next=node.next;
        if(next==null){
            return;
        }
        reverseRecursive(next);
        curr.next.next=curr;
        curr.next=null;
        node = next;
    }

    public void printLinkedList(Node node_head){
        System.out.println("printing now ");
        Node n = node_head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

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
