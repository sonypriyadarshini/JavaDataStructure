public class StackUsingLinkedList {
    Node head, tail;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    //push in stack
    public void push(Node n){
        if(head==null){
            head=n;
            tail = head;
        }
        else{
            tail.next=n;
            tail =n;
        }
    }

    //pop in stack
    public void pop(Node n){
        Node t = head;
        Node prev=null;
        while(t!=null && t!=tail){
            prev =t;
            t=t.next;
        }
        prev.next = null;

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

    public static void main(String args[]){
        StackUsingLinkedList s = new StackUsingLinkedList();
        Node first = new Node(99);
        Node sec = new Node(100);
        s.push(first);
        s.push(sec);
        s.printLinkedList(first);
        s.pop(sec);
        s.printLinkedList(first);
    }
}
