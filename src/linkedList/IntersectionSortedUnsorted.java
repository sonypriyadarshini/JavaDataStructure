package linkedList;

import java.util.HashSet;

public class IntersectionSortedUnsorted {
    public static void main(String args[]){

        IntersectionSortedUnsorted list = new IntersectionSortedUnsorted();
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = list.head1.next.next.next;
//        list.head2.next.next = new Node(30);
        list.findIntersection(list.head1,list.head2);
    }

    public void findIntersection(Node head1,Node head2){
        HashSet<Node> hashSet = new HashSet<>();
        Node h1=head1,h2=head2;
        while(h1!=null){
            if(hashSet.contains(h1)){
                System.out.println("point of intersection "+h1.data);
                return;
            }
            hashSet.add(h1);
            h1 = h1.next;
        }
        while(h2!=null){
            if(hashSet.contains(h2)){
                System.out.println("point of intersection "+h2.data);
                return;
            }
            hashSet.add(h2);
            h2=h2.next;
        }
    }

     Node head1,head2;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
}
