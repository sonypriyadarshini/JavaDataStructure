package testpakg.crackingTheCodingInterview.chapter4_TreeAndGraphs;

/*
T1 and T2 are two very large binary trees, with T1 much bigger than T2. Create an
testpakg.algorithm to determine if 12 is a subtree ofTl .
AtreeT2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to 12,
That is, if you cut off the tree at node n, the two trees would be identical.

https://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-binary-tree/
 */
public class CheckSubtree_10 {

    static class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int d){
            data=d;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(4);
        root.right=new TreeNode(6);


        TreeNode root2=new TreeNode(26);
        root2.left=new TreeNode(10);
        root2.right=new TreeNode(3);
        root2.left.left=new TreeNode(4);
        root2.left.right=new TreeNode(6);

        System.out.println(validateSubtree(root2,root));

    }

    static boolean validateSubtree(TreeNode t,TreeNode s){
        if(t==null)
            return false;
        if(s==null)
            return true;
        if(isIdentical(t,s))
            return true;
        return validateSubtree(t.left,s) || validateSubtree(t.right,s);
    }

    static boolean isIdentical(TreeNode t, TreeNode s){
        if(t==null && s==null)
            return true;
        if(t==null || s==null)
            return false;
        return (t.data==s.data&&isIdentical(t.left,s.left)&&isIdentical(t.right,s.right));
    }
}
