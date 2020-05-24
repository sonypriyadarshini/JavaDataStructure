package tree;

import java.util.ArrayList;

public class BinaryTree {

    static class Node {
        int key_data;
        Node left, right;

        public Node(int data) {
            key_data = data;
            left = right = null;
        }
    }

    Node root;

    BinaryTree(int data) {
        root = new Node(data);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);

        tree.root = new Node(10);
        tree.root.left     = new Node(5);
        tree.root.right     = new Node(50);
        tree.root.left.left = new Node(1);
        tree.root.right.left = new Node(40);
        tree.root.right.right = new Node(100);
        System.out.println("PreOrder:  ");
        tree.preorder(tree.root);
        System.out.println("Inoder:  ");
        tree.inorder(tree.root);
        System.out.println("PostOrder:  ");
        tree.postorder(tree.root);

        System.out.println("max depth :  "+maxDepth(tree.root));

        System.out.println("kth node "+tree.kthSmallest(tree.root,5));



        tree.getCount(tree.root,5,45);
        System.out.println("count in range "+count);
    }

static int count=0;
    void getCount(Node node, int low, int high)
    {
        // Base Case
        if(node == null)
            return;

        // If current node is in range, then
        // include it in count and recur for
        // left and right children of it
        if(node.key_data >= low && node.key_data <= high)
        {   count++;
            getCount(node.right, low, high);
            getCount(node.left, low, high);
        }

            // If current node is smaller than low,
            // then recur for right child
        else if(node.key_data < low)
            getCount(node.right, low, high);

            // Else recur for left child
        else
            getCount(node.left, low, high);
    }


    public static ArrayList<Integer> res=new ArrayList<>();

    public int kthSmallest(Node root, int k) {
        reverseInorder(root);
        return res.get(k-1);
    }

    public static void reverseInorder(Node node){
        if(node==null)
            return;
        reverseInorder(node.left);
        res.add(node.key_data);
        reverseInorder(node.right);
    }

    public void preorder(Node n) {
        if (n == null)
            return;
        System.out.println(n.key_data);
        preorder(n.left);
        preorder(n.right);
    }

    public void inorder(Node n) {
        if (n == null)
            return;
        inorder(n.left);
        System.out.println(n.key_data);
        inorder(n.right);
    }

    public void postorder(Node n) {
        if (n == null)
            return;
        postorder(n.left);
        postorder(n.right);
        System.out.println(n.key_data);
    }

    public static int maxDepth(Node n) {
        if(n==null)
            return 0;
        else if(n.left==null && n.right==null)
            return 1;
        return 1+Math.max(maxDepth(n.left),maxDepth(n.right));

    }

}


