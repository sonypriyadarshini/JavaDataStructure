package crackingTheCodingInterview.chapter4_TreeAndGraphs;

/*
First Common Ancestor: Design an algorithm and write code to find the first common ancestor
of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
necessarily a binary search tree.

https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/

https://www.youtube.com/watch?v=13m9ZCB8gjw

 */

public class LowestCommonAncestor_8 {

    static class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println(findAncestor(root,root.left.left,root.right.left).data);
    }

    static TreeNode findAncestor(TreeNode root,TreeNode n1, TreeNode n2){
        if(root==null)
            return null;
        if(root==n1 || root==n2)
            return root;
        TreeNode left=findAncestor(root.left,n1,n2);
        TreeNode right=findAncestor(root.right,n1,n2);
        if(left!=null && right!=null)
            return root;
        if(left==null && right ==null)
            return null;
        return left==null?right:left;
    }


}
