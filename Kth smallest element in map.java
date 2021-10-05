/*
Problem Description
Given a binary search tree, write a function to find the node with the kth smallest value in it and return its value.

Note: You may assume that k is always valid, 1 ≤ k ≤ BST's total elements.

Input format
Line1 to X: Details of the binary tree structure (refer section below for the format)

Last line contains a single integer k.

Output format
Print the value of the kth smallest element.

Constraints
1 <= Number of nodes (N) <= 105

1 <= Value of nodes <= 109

1 <= k <= N

Sample Input 1
4

3 1 4 2

1 2 3

2 -1 4

3 -1 -1

4 -1 -1

1

Sample Output 1
1

Explanation 1
image alt text

1 is the 1st smallest element in this BST



*/
import crio.ds.Tree.TreeNode;
import java.util.*;

/*
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}
*/


public class Solution {

     void inOrder(TreeNode root, ArrayList<Integer> l1){
        if(root==null) return ;

        inOrder(root.left, l1);
        l1.add((int)root.val);
        inOrder(root.right,l1);
    }

    public int kthSmallestElementInABst(TreeNode root, int k) {
        // convert  bST to Inorder , get (k-1) ele, as Inorder is sorted in nature 

        ArrayList<Integer> list=new ArrayList<>();

        inOrder(root,list);
        return list.get(k-1);
        
    }
}
