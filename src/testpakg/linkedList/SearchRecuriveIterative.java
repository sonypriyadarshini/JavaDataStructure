package testpakg.linkedList;

public class SearchRecuriveIterative {
    public static void main(String args[]){
        SearchRecuriveIterative linkList = new SearchRecuriveIterative();
        linkList.head = new Node(32);
        Node second = new Node(33);
        Node third = new Node(34);
        linkList.head.next=second;
        second.next=third;
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
