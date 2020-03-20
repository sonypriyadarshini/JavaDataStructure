package testpakg.crackingTheCodingInterview.chapter2_LinkedList;

public class RemoveDuplicateUnsortedList_1 {

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    //using hashset

    //without using hashset
    static void remomeDup(Node head){
        Node cur=head;
        while(cur!=null){
            Node temp=cur;
            while(temp.next!=null){
                if(temp.next.data==cur.data)
                    temp.next=temp.next.next;
                else
                    temp=temp.next;
            }
            cur=cur.next;
        }
    }

    public static void main(String[] args) {

    }
}


