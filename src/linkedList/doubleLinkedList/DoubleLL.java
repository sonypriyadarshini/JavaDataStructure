package linkedList.doubleLinkedList;

public class DoubleLL {

    public static void main(String args[]){
        DoubleLL doubleLinkList = new DoubleLL();
        doubleLinkList.push(head,3);
        doubleLinkList.push(head,30);
        doubleLinkList.push(head,300);
        doubleLinkList.push(head,3000);
        doubleLinkList.push(head,30000);
        System.out.println("printing ");
        doubleLinkList.printLinkedList(head);
        doubleLinkList.deleteNode(head.next);
        System.out.println("printing ");
        doubleLinkList.printLinkedList(head);
        doubleLinkList.reverse(head);
        System.out.println("printing ");
        doubleLinkList.printLinkedList(head);
    }

    public void push(Node node, int data){
        Node n = new Node(data);
        n.next=head;
        n.prev=null;
        if(head!=null)
            head.prev=n;
        head=n;
//        System.out.println(head.data);
    }

    public void deleteNode(Node n){
        Node temp=head, prev=null;
        if(temp==n){
            head = head.next;
        }
        while(temp!=n){
        prev = temp;
        temp = temp.next;
        }
        prev.next=temp.next;
        temp.next.prev=prev;
        temp.next=null;
        temp.prev=null;
    }

    public void reverse(Node n){
        Node prev=null, curr=n;
        while(curr!=null){
            prev =curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        if(prev!=null){
            head=prev.prev;
        }
    }

    public void printLinkedList(Node node_head){
        Node n = node_head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    static Node head;
    public static class Node{
        Node next, prev;
        int data;
        Node(int d){
            data=d;
            next=prev=null;
        }
    }
}
