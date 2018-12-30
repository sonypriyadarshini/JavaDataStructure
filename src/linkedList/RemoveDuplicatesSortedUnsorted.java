package linkedList;

import java.util.HashSet;

public class RemoveDuplicatesSortedUnsorted {
    public static void main(String args[]){
        RemoveDuplicatesSortedUnsorted linkList = new RemoveDuplicatesSortedUnsorted();
        linkList.head = new Node(32);
        Node second = new Node(33);
        Node third = new Node(33);
        linkList.head.next=second;
        second.next=third;
        linkList.removeDupUnsorted(linkList.head);
        linkList.printLinkedList(linkList.head);
        linkList.removeDupSorted(linkList.head);
        linkList.printLinkedList(linkList.head);

    }

    //using hashset for unsorted list
    public void removeDupUnsorted(Node node){
        Node temp=node, prev=node;
        HashSet<Integer> hashSet = new HashSet<>();
        while(temp!=null)
        {
            System.out.println("inside while");
            System.out.println("temp is "+temp.data);
            if(hashSet.contains(temp.data))
            {
                System.out.println("inside if");
                prev.next = temp.next;
                temp.next=null;

            }
            prev =temp;
            hashSet.add(temp.data);
            temp=temp.next;
        }
    }

    // for sorted list
    public void removeDupSorted(Node node){
        Node temp=node, next=node;
        while(temp.next!=null)
        {
            System.out.println("inside while");
            System.out.println("temp is "+temp.data);
            if(temp.data==temp.next.data)
            {
                next=temp.next;
                temp.next=temp.next.next;
                next.next=null;
            }
            temp=temp.next;
        }
    }


    public void printLinkedList(Node node_head){
        Node n = head;
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
