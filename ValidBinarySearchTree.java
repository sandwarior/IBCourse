/**
Given a binary tree, determine if it is a valid binary search tree (BST). Assume a BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example :
Input : 
   1
  /  \
 2    3

Output : 0 or False


Input : 
  2
 / \
1   3

Output : 1 or True 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem SOLUTION APPROACH : VIDEO : https://www.youtube.com/watch?v=yEwSGhSsT0U
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
    int flag=1;
    public int isValidBST(TreeNode A) {
        int ans = isValid(A,Integer.MAX_VALUE,Integer.MIN_VALUE);
        return ans;
    }
    public int isValid(TreeNode root,int max,int min){
        if(root.val<=min || root.val>=max)
        return 0;
        int left=1,right=1;
        if(root.left!=null)
        left = isValid(root.left,root.val,min);
        if(root.right!=null)
        right = isValid(root.right,max,root.val);
      //  System.out.println(root.val+" "+max+" "+min);
        if(left==0 || right==0)
        return 0;
        else
        return 1;
    }
}
