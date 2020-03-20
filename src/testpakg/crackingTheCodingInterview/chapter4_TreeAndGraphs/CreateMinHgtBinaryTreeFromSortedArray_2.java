package testpakg.crackingTheCodingInterview.chapter4_TreeAndGraphs;

/*
https://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 */
public class CreateMinHgtBinaryTreeFromSortedArray_2 {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    static void preOrderTreeTraversal(Node node){
        if(node==null)
            return;
        System.out.println(node.data);
        preOrderTreeTraversal(node.left);
        preOrderTreeTraversal(node.right);
    }

    static Node  construtctBinaryTreeFromArray(int ar[], int start,int end){
        if(start>end)
            return null;
         int mid= (start+end)/2;
         Node node=new Node(ar[mid]);
         node.left=construtctBinaryTreeFromArray(ar,start,mid-1);
        node.right=construtctBinaryTreeFromArray(ar,mid+1,end);
        return node;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Node root=construtctBinaryTreeFromArray(arr,0,n-1);
        preOrderTreeTraversal(root);
    }
}
