package crackingTheCodingInterview.chapter4_TreeAndGraphs;

/*
https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
 */
public class ValidateIfBinaryTreeIsBalance_4 {

    static class Node{
        Node left, right;
        int data;
        Node(int d){
            data=d;
        }
    }

    static boolean isBalanced(Node node){
        if(node==null)
            return true;
        int l=hieght(node.left);
        int r=hieght(node.right);

        if(Math.abs(l-r)<=1 && isBalanced(node.right) && isBalanced(node.right)){
            return true;
        }
        return false;
    }

    static int hieght(Node node){
        if(node==null)
            return 0;
        return 1+ Math.max(hieght(node.left),hieght(node.left));
    }

    Node root;
    public static void main(String[] args) {
        Node n=new Node(1);
        n.left=new Node(2);
        n.right=new Node(3);
        n.left.left=new Node(4);
        n.left.right=new Node(5);
        n.left.left.left=new Node(8);
        System.out.println(isBalanced(n));
    }
}
