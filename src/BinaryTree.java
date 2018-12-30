class Node{
    int key_data;
    Node left, right;
    public Node(int data){
        key_data=data;
        left= right=null;
    }
}
public class BinaryTree {
    Node root;

    BinaryTree(int data){
        root = new Node(data);
    }
    BinaryTree(){
        root = null;
    }

    public void inorder(Node n){
        if(n==null)
            return;
        inorder(n.left);
        System.out.println(n.key_data);
        inorder(n.right);
    }

    public void postorder(Node n){
        if(n==null)
            return;
        postorder(n.left);
        postorder(n.right);
        System.out.println(n.key_data);
    }

    public void preorder(Node n){
        if(n==null)
            return;
        System.out.println(n.key_data);
        preorder(n.left);
        preorder(n.right);
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree(1);

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("PreOrder:  ");
        tree.preorder(tree.root);
        System.out.println("Inoder:  ");
        tree.inorder(tree.root);
        System.out.println("PostOrder:  ");
        tree.postorder(tree.root);

    }

}


