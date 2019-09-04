/**
Inorder Traversal
Given a binary tree, return the inorder traversal of its nodes' values. Example : Given binary tree
   1
    \
     2
    /
   3
return [1,3,2]. Using recursion is not allowed.
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
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        inorder(A);
        return arr;
    }
    void inorder(TreeNode root){
        if(root.left==null && root.right==null)
        arr.add(root.val);
        else{
        if(root.left!=null)
        inorder(root.left);
        arr.add(root.val);
        if(root.right!=null)
        inorder(root.right);
        }
        
    }
}
