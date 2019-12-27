package crackingTheCodingInterview.chapter2_LinkedList;

public class LoopDetection_8 {

    static class Node{
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }

    public static void main(String[] args) {
        Node head=new Node(3);
        head.next=new Node(4);
        head.next.next=new Node(8);
        head.next.next.next=head.next;
        DetectLoop(head);
        printFirstNodeOfLoop(head);
    }

    //checks if loop if present
   static void DetectLoop(Node head){
        Node slow=head,fast=head;
        while (slow!=null &&   fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("true");
            return;}
        }
        System.out.println("false");
    }

    //prints the first node of the loop
    static void printFirstNodeOfLoop(Node head){
        if(head==null || head.next==null)
            return;
        Node slow=head,fast=head;
        do{
            slow=slow.next;
            fast=fast.next.next;
        }while ( fast!=null && fast.next!=null && slow!=fast);
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
        }

    }

