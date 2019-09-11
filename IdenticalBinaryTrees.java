/**
Given two binary trees, write a function to check if they are equal or not. Two binary trees are considered equal if they are structurally identical and the nodes have the same value. Return 0 / 1 ( 0 for false, 1 for true ) for this problem Example :
Input : 

   1       1
  / \     / \
 2   3   2   3

Output : 
  1 or True
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A==null && B==null)
        return 1;
        if(A==null && B!=null)
        return 0;
        if(A!=null && B==null)
        return 0;
        int l=0,r=0;
        if(A.val!=B.val)
        return 0;
        l=isSameTree(A.left,B.left);
        r=isSameTree(A.right,B.right);
        if(l==1 && r==1)
        return 1;
        else return 0;
    }
}
