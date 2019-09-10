/**
Given a binary tree, invert the binary tree and return it. Look at the example for more details. Example : Given binary tree
     1
   /   \
  2     3
 / \   / \
4   5 6   7
invert and return
     1
   /   \
  3     2
 / \   / \
7   6 5   4
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
    public TreeNode invertTree(TreeNode A) {
        invert(A);
        return A;
    }
    public TreeNode invert(TreeNode root){
        if(root==null)
        return root;
        else{
            TreeNode left=null;
            TreeNode right=null;
            if(root.left!=null)
            left=invert(root.left);
            if(root.right!=null)
            right=invert(root.right);
            root.left = right;
            root.right = left;
            return root;
        }
    }
}
