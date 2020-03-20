package testpakg.linkedList.circularLinkedList;

public class CLLTraversal {
    public static void main(String args[]){
        CLLTraversal circularLinkList = new CLLTraversal();
        circularLinkList.push(33);
        circularLinkList.push(34);
        circularLinkList.push(39);
        circularLinkList.push(390);

        circularLinkList.printLinkedList(head);
        circularLinkList.validateCircular();
    }

    public void push(int d){
        Node temp=head,prev=null,last=null;
        Node new_node = new Node(d);
        System.out.println("before "+new_node.data);

        if(head ==null){
            head = new_node;
            head.next=head;
            return;
        }
        while (temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.next=head;
        System.out.println("next "+new_node.next.data);
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



    public void printLinkedList(Node node_head){
        Node no = head;
        do{
            System.out.println(no.data);
            no=no.next;
        }while(no!=node_head);

    }

   static Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data =d;
        }
    }
}
