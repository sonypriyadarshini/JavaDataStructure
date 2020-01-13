package crackingTheCodingInterview.chapter4_TreeAndGraphs;

import java.util.ArrayList;
import java.util.Random;

/*
Random Node: You are implementing a binary tree class from scratch which, in addition to
insert , find , and delete , has a method getRandomNode() which returns a random node
from the tree. All nodes should be equally likely to be chosen. Design and implement an algorithm
for getRandomNode, and explain how you would implement the rest of the methods.

https://www.geeksforgeeks.org/select-random-node-tree-equal-probability/
 */

public class RandomNode_11 {
    static class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        RandomNode_11 randomNode_11=new RandomNode_11();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        randomNode_11.inorderTraversal(root);
        Random random = new Random();
        int rand_int1 = random.nextInt(randomNode_11.inordered.size()-1);
        System.out.println(randomNode_11.inordered.get(rand_int1));

    }

    ArrayList<Integer> inordered=new ArrayList<>();
     void inorderTraversal(TreeNode node){
         if(node==null)
             return;
        inordered.add(node.data);
         inorderTraversal(node.left);
         inorderTraversal(node.right);
    }
}
