package testpakg.linkedList;

public class SearchNthNode {
    public static void main(String args[]){
        SearchNthNode linkList = new SearchNthNode();
        linkList.head = new Node(32);
        Node second = new Node(33);
        Node third = new Node(34);
        linkList.head.next=second;
        second.next=third;
        linkList.findNodeDataByPos(2);
        System.out.println(linkList.findNodeDataRecursion(1));
        linkList.findNodeByKey(30);
        linkList.findNodeByKeyRecursive(33,linkList.head);
    }

    //search nth node by position, iterative
    public void findNodeDataByPos(int pos){
        Node prev = head;
        if(pos ==0){
            System.out.println(head.data);
            return;
        }
        for(int i=0; i<pos;i++){
            prev =prev.next;
        }
        System.out.println(prev.data);
        if(prev==null){
            return ;
        }
    }

    //search nth node by position, recursive
    public int findNodeDataRecursion(int pos){
        Node temp = head; int count=1;
        if(count==pos)
            return temp.data;
        return findNodeDataRecursion(pos-1);
    }

    //search noce by data. iterative
    public void findNodeByKey(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("true");
                return;}
            temp=temp.next;
        }
        System.out.println("false");
    }

    //search noce by data. recursive
    public void findNodeByKeyRecursive(int data, Node node){
        Node temp = node;
        if(temp==null){
            System.out.println("false");
            return;
        }
        if(temp.data==data){
            System.out.println("true");
        return;}
        findNodeByKeyRecursive(data,node.next);

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
