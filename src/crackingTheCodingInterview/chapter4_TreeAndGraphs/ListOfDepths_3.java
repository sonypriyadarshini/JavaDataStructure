package crackingTheCodingInterview.chapter4_TreeAndGraphs;

import java.util.ArrayList;

/*
List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).

https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class ListOfDepths_3 {

    static class TreeNode{
        TreeNode left, right;
        int data;
        TreeNode(int d){
            data=d;
            left=right=null;
        }
    }

    int findDepth(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        return 1 + Math.max(findDepth(root.left),findDepth(root.right));
    }

    void levelOrderTraversal(TreeNode node, int l){
        if(node==null)
            return;
        if(l==1)
            list.add(node.data);
        levelOrderTraversal(node.left,l-1);
        levelOrderTraversal(node.right,l-1);
    }

    ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        ListOfDepths_3 listOfDepths_3=new ListOfDepths_3();
        int d=listOfDepths_3.findDepth(root);


        for(int i=1;i<=d;i++){
            listOfDepths_3.list.clear();
            listOfDepths_3.levelOrderTraversal(root,i);
            System.out.println(listOfDepths_3.list);
        }
    }
}
