package linkedList;
/* 1 being added to a number stored in a Linked List */

public class AddNumber {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static Node head;
    public static void main(String args[]){
        head = new Node(9);
        head.next = new Node(9);
        head.next.next=new Node(1);
        Node n = addnum(head);
        print(n);
    }

    public static Node addnum(Node n){
        Node temp=null,res=n;
        int sum=0, carry=1;
        while(n!=null){
            sum = carry+n.data;
            carry = (sum>=10?1:0);
            sum=sum%10;
            n.data=sum;

            temp=n;
            n=n.next;
        }
        if(carry>0)
            temp.next=new Node(carry);
        return res;
    }

    public static void print(Node n){
        Node temp=n;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

