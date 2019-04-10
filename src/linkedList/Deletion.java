package linkedList;

import linkedList.circularLinkedList.CLLTraversal;

public class Deletion {
    public static void main(String args[]){
       Deletion linkList = new Deletion();
       linkList.head = new Node(32);
       Node second = new Node(33);
       Node third = new Node(34);
       linkList.head.next=second;
       second.next=third;
        linkList.printLinkedList(linkList.head);
        linkList.deleteByValue(32);
        linkList.deleteByPosition(1);
       linkList.printLinkedList(linkList.head);
       linkList.validateCircular();
    }

          Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public void deleteByValue(int val){
        Node n = head;
        Node prev = head;
        if(n.data ==val){
            head = n.next;
            return;
        }
        while(n!=null && n.data!=val){
            prev = n;
            n =n.next;
        }
        if(n==null){
            return ;
        }
        prev.next = n.next;
        n.next=null;
    }

    public void deleteByPosition(int pos){
        Node prev = head;
        if(pos ==0){
            head = prev.next;
            return;
        }
        for(int i=0; i<pos-1&&prev!=null;i++){
            prev =prev.next;
        }
        if(prev==null){
            return ;
        }
        Node next=prev.next.next;
        prev.next=next;
    }

    public void printLinkedList(Node node_head){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }

    public void validateCircular(){
        Node n=head;
        while (n.next!=null&&n.next!=head){
            n=n.next;
        }
        if(n==head)
            System.out.println("circular at"+n.next.data);
        else
            System.out.println("not circular");

    }
}
