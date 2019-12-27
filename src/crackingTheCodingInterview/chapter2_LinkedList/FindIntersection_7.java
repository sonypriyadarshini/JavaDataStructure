package crackingTheCodingInterview.chapter2_LinkedList;

public class FindIntersection_7 {

    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }

    //without using hashset
    void findIntersection(Node head1, Node head2){
        int h1=0,h2=0;
        Node hh1=head1,hh2=head2;
        while(hh1!=null){
            h1++;
            hh1=hh1.next;
        }
        while(hh2!=null){
            h2++;
            hh2=hh2.next;
        }
        int d=Math.abs(h1-h2);
        int x=Math.abs(h1-h2);

        if(h1>h2){
            while(d>0){
                head1=head1.next;
                d--;
            }
        }
        else{
            while(x>0){
                head2=head2.next;
                x--;
            }
        }
        while(head1!=head2){
            head1=head1.next;
            head2=head2.next;
        }
        System.out.println(head1.data);
    }

    public static void main(String[] args) {
        FindIntersection_7 list=new FindIntersection_7();
        Node head1,head2;
        head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        // creating second linked list
        head2 = new Node(10);
        head2.next = head1.next.next.next;
//        list.head2.next.next = new Node(30);
        list.findIntersection(head1,head2);
    }
}
