package testpakg.crackingTheCodingInterview.chapter2_LinkedList;

public class FindKthLastElementInLinkedList_2 {

    static class Node{
        Node next=null;
        int data;
        Node(int d){
            data=d;
        }
    }

    public static void main(String[] args) {
        Node head =new Node(3);
        head.next=new Node(4);
        head.next.next=new Node(5);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(9);
        System.out.println(findKthElement(head,2));

    }

    static int findKthElement(Node head,int k){

        Node slow=head, fast=head;
        for(int i=0;i<k+1;i++)
            slow=slow.next;
        while(slow!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return fast.data;

    }
}
