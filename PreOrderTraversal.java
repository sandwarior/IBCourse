/**
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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        preOrder(A);
        return arr;
    }
    void preOrder(TreeNode root){
        if(root.left==null && root.right==null)
        arr.add(root.val);
        else{
        arr.add(root.val);
        if(root.left!=null)
        preOrder(root.left);
        if(root.right!=null)
        preOrder(root.right);
        }
        
    }
}
