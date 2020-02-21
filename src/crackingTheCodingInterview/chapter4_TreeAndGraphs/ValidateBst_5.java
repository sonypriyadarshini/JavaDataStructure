package crackingTheCodingInterview.chapter4_TreeAndGraphs;
/*
Validate BST: Implement a function to check if a binary tree is a binary search tree.
binary search tree: A binary tree which satisfies the condition, left node<root node<right node
 */

public class ValidateBst_5 {

    static class Node{
        Node left, right;
        int data;
        Node(int d){
            data=d;
        }
    }

    static boolean isBST(Node node){
        return isBSTUtil(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    static boolean isBSTUtil(Node node,int min,int max){
        if(node==null)
            return true;
        if(node.data<min || node.data>max)
            return false;

        return (isBSTUtil(node.left,min,node.data-1) && isBSTUtil(node.right,node.data+1,max));
    }

    public static void main(String[] args) {
        Node n=new Node(4);
        n.left=new Node(2);
        n.right=new Node(5);
        n.left.left=new Node(1);
        n.left.right=new Node(3);
//        n.left.left.left=new Node(8);
        System.out.println(isBST(n));
    }
}
