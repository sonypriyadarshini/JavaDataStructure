package crackingTheCodingInterview.chapter4_TreeAndGraphs;

/*
https://leetcode.com/problems/path-sum-iii/discuss/464587/Java-%3A-Runtime%3A-O(n)-%3A3-ms-faster-than-99.92-submissions.
https://www.geeksforgeeks.org/print-k-sum-paths-binary-tree/
 */

import java.util.ArrayList;

public class CountPathForSum_12 {

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
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.right = new TreeNode(-1);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(2);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(2);

        CountPathForSum_12 countPathForSum_12=new CountPathForSum_12();
        countPathForSum_12.countPaths(root,5);
        System.out.println(countPathForSum_12.count);
    }
    int count=0;

    ArrayList<Integer> list=new ArrayList<>();
    void countPaths(TreeNode node, int k){
        if(node==null)
            return ;
        list.add(node.data);
        countPaths(node.left,k);
        countPaths(node.right,k);
        int s=0;
        for(int i=list.size()-1;i>=0;i--){
            s+=list.get(i);
            if(s==k){
                count++;
            }
        }
        list.remove(list.size()-1);
    }

}
