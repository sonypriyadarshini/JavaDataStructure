package tree;

//different problems related to path sum in tree.

import crackingTheCodingInterview.chapter4_TreeAndGraphs.CountPathForSum_12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SumTree {

    static class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int d){
            data=d;
            left=right=null;
        }
    }

    static List<Integer> path=new LinkedList<>();
    static List<Integer> path2=new LinkedList<>();
    static int maxSum=0;
    static boolean flag=false;
    static List<List<Integer>> allPathList=new LinkedList<>();

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(2);
        root.right = new TreeNode(-1);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(2);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(20);

        SumTree SumTree=new SumTree();

        System.out.println();
        System.out.println("===================================================================================");
        System.out.println(" 1. find if a sum is present in a binary tree path from root to leaf");
        System.out.println("===================================================================================");
        SumTree.isSumPresent(root,6,0);
        if(flag==true)
            System.out.println("true : sum 6 is present from root to leaf");
        System.out.println();


        System.out.println();
        System.out.println("===================================================================================");
        System.out.println("2. find all paths with given sum (sum=12) not necessarily from root to leaf");
        System.out.println("===================================================================================");
        path.clear();
        SumTree.findAllSumPath(root,12,0);
        System.out.println();

        System.out.println();
        System.out.println("===================================================================================");
        System.out.println("3. find max of all path sums from root to leaf");
        System.out.println("===================================================================================");
            SumTree.maxSumTree(root,0);
        System.out.println();

        System.out.println();
        System.out.println("===================================================================================");
        System.out.println("4. find all paths from root to leaf");
        System.out.println("===================================================================================");
        path2.clear();
        SumTree.findAllRootToLeafPaths(root);
        System.out.println(allPathList);
        System.out.println();

        System.out.println();
        System.out.println("===================================================================================");
        System.out.println("5. find sum of all paths");
        System.out.println("===================================================================================");
        path2.clear();
        maxSum=0;
        SumTree.findSumOfAllPaths(root);
        System.out.println(maxSum);
        System.out.println();

        String sp="abc";sp=sp.toUpperCase();
        int sum=0;
        sum=sum+sp.charAt(0)-64 ;
        System.out.println(sum);


    }



    //is a sum present in root to leaf path
    void isSumPresent(TreeNode root, int sum, int sumsofar){
        if(root==null)
            return ;
        sumsofar+=root.data;
        path.add(root.data);

        if(root.left==null && root.right==null && sum==sumsofar){
            flag=true;
            System.out.println("true");
            System.out.println(path);
            return;
        }
        if(root.left!=null)
            isSumPresent(root.left,sum,sumsofar);
        if(root.right!=null)
            isSumPresent(root.right,sum,sumsofar);
        path.remove(path.size()-1);
    }

    //find all path (not necessarily root to leaf) for a sum from root
    void findAllSumPath(TreeNode root, int sum, int sumsofar){
        if(root==null)
            return ;
        sumsofar+=root.data;
        path.add(root.data);

        if(sum==sumsofar){
            System.out.println(path);
        }
        if(root.left!=null)
            findAllSumPath(root.left,sum,sumsofar);
        if(root.right!=null)
            findAllSumPath(root.right,sum,sumsofar);
        path.remove(path.size()-1);
    }


    //find max sum
    void maxSumTree(TreeNode root, int sumsofar){
        if(root==null)
            return ;
        sumsofar+=root.data;
        path2.add(root.data);

        if(root.left==null && root.right==null){
            System.out.println(path2);
            maxSum=Math.max(maxSum,sumsofar);
            System.out.println(maxSum);
        }
        if(root.left!=null)
            maxSumTree(root.left,sumsofar);
        if(root.right!=null)
            maxSumTree(root.right,sumsofar);
        path2.remove(path2.size()-1);
    }

    //find all root to leaf paths
    void findAllRootToLeafPaths(TreeNode root){
        if(root==null)
            return ;
        path2.add(root.data);

        if(root.left==null && root.right==null){
            System.out.println(path2);
            allPathList.add(new LinkedList<>(path2));
        }
        if(root.left!=null)
            findAllRootToLeafPaths(root.left);
        if(root.right!=null)
            findAllRootToLeafPaths(root.right);
        path2.remove(path2.size()-1);
    }

    void findSumOfAllPaths(TreeNode root){
        if(root==null)
            return ;
        path2.add(root.data);

        if(root.left==null && root.right==null){
            int num=0;
            for(int i=0;i<path2.size();i++){
                if(path2.get(i)>9){
                    int pathNum=path2.get(i);
                    int counter=0;
                    while(pathNum>0)
                    {
                        counter++;
                        pathNum=pathNum/10;
                    }
                    num=num*((int)(Math.pow(10,counter)))+Math.abs(path2.get(i));
                }
                else
                num=num*10+Math.abs(path2.get(i));
            }
            maxSum+=num;
            System.out.println(num);
        }
        if(root.left!=null)
            findSumOfAllPaths(root.left);
        if(root.right!=null)
            findSumOfAllPaths(root.right);
        path2.remove(path2.size()-1);
    }
}
