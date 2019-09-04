/**
Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values. Example : Given binary tree
   1
    \
     2
    /
   3
return [3,2,1]. Using recursion is not allowed.
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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        postOrder(A);
        return arr;
    }
    void postOrder(TreeNode root){
        if(root.left==null && root.right==null)
        arr.add(root.val);
        else{
        if(root.left!=null)
        postOrder(root.left);
        if(root.right!=null)
        postOrder(root.right);
        arr.add(root.val);
        }
        
    }
}
