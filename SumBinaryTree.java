/**
Given a binary tree. Check whether the given tree is a Sum-binary tree or not. SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree. Return 1 if it sum-binary tree else return 0. 
Input Format
Input 1:
       26
     /    \
    10     3
   /  \     \
  4   6      3
Output 1:
    1

Input 2:
       26
     /    \
    10     3
   /  \     \
  4   6      4
Output 2:
    0
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
    public int solve(TreeNode A) {
        int sum = sumTree(A);
        if(sum==-1)
        return 0;
        else
        return 1;
    }
    public int sumTree(TreeNode root){
        if(root.left==null && root.right==null)
        return root.val;
        else{
            int left,right;
            if(root.left!=null)
            left = sumTree(root.left);
            else
            left= 0;
            if(root.right!=null)
            right = sumTree(root.right);
            else
            right=0;
            if(left==-1 || right==-1)
            return -1;
            else{
            if(left+right==root.val)
            return root.val+left+right;
            else
            return -1;
            }
        }
    }
}
