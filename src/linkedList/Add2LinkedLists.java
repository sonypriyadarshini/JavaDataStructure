package linkedList;
/*
2 numbers 321 and 43 are being added here,
the heads of both LinkList pointing to the last digit of each number
*/
public class Add2LinkedLists {
    static Node head, head2;

    public static void main(String args[]) {
        head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head2 = new Node(5);
        head2.next = new Node(4);
        Node res= addNumbers(head,head2);
        while(res!=null){
            System.out.println(res.data);
            res=res.next;
        }
    }

    public static Node addNumbers(Node first, Node second) {
        int sum = 0, carry = 0;
        Node temp=null, res = null, prev = null;

        while (first != null || second != null) {

            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = sum >= 10 ? 1 : 0;
            sum = sum % 10;

            temp = new Node(sum);

            if (res == null) {
                res = temp;
            }
            else {
                prev.next = temp;
            }
            prev = temp;

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }
        if(carry>0){
            temp.next=new Node(carry);
//            prev.next=temp;
        }
        return res;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
