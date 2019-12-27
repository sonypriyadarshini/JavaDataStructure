package crackingTheCodingInterview.chapter2_LinkedList;

import linkedList.Add2LinkedLists;

public class AddLinkListStraight_5 {

    static class Node{
        Node next;int data;
        Node(int d){
            data=d;
        }
    }
    public static void main(String[] args) {
          Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(4);
        Node res=addLinkLists(head,head2);
        while(res!=null){
            System.out.println(res.data);
            res=res.next;
        }

    }

    static Node addLinkLists(Node head1, Node head2){
        int sum, carry=0;
        Node res=null,prev=null,tnode=null;
        while(head1!=null || head2!=null){
            sum=carry+((head1!=null)?head1.data:0)+((head2!=null)?head2.data:0);
            carry=sum>=10?1:0;
            sum=sum%10;

            tnode=new Node(sum);
            if(res==null){
                res=tnode;
            }
            else{
                prev.next=tnode;
            }
            prev=tnode;

            if(head1!=null)
                head1=head1.next;
            if(head2!=null)
                head2=head2.next;

        }
        if(carry>=1){
            tnode.next=new Node(carry);
        }
        return res;
    }


    //https://www.geeksforgeeks.org/sum-of-two-linked-lists/

}
