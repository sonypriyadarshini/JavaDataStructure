package linkedList;

public class LengthOfLoop {
    public static void main(String args[]) {
        LengthOfLoop linklist = new LengthOfLoop();
        linklist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linklist.head.next = second;
        second.next = third;
        third.next=fourth;
        fourth.next=linklist.head;
        linklist.findLoopLength(linklist.head);

    }

    public void findLoopLength(Node node) {
        Node slow_ptr =node, fast_ptr =node;

        while(slow_ptr!=null&&fast_ptr!=null&&fast_ptr.next!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if(slow_ptr==fast_ptr){
                Node temp = slow_ptr;
                int count=1;
                while(temp.next!=slow_ptr){
                    count++;
                    temp=temp.next;
                }
                System.out.println("length of loop "+count);
                return ;
//                return(countNode(slow_ptr));
            }

        }
    }

    int countNode(Node slow_p){
        Node temp = slow_p;
        int count=1;
        while(temp.next!=slow_p){
            count++;
            temp=temp.next;
        }
        System.out.println("length of loop "+count);
        return count;

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
