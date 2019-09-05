/**
Given a binary tree, determine if it is height-balanced.
 Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem Example :
Input : 
          1
         / \
        2   3

Return : True or 1 

Input 2 : 
         3
        /
       2
      /
     1

Return : False or 0 
         Because for the root node, left subtree has depth 2 and right subtree has depth 0. 
         Difference = 2 > 1. 
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
    public int isBalanced(TreeNode A) {
        int check = checkBalance(A);
        if(check==-1)
        return 0;
        else
        return 1;
    }
    public int checkBalance(TreeNode root){
        
        int left,right;
        if(root.left!=null){
          left = checkBalance(root.left);
        }else{
            left=0;
        }
        if(root.right!=null){
          right = checkBalance(root.right);
        }else{
            right=0;
        }
        if(left==-1 || right==-1)
        return -1;
        else{
        if(Math.abs(right-left)>1)
        return -1;
        else
        return Math.max(left,right)+1;
        }
    }
}
