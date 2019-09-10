/**
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center). Example :
    1
   / \
  2   2
 / \ / \
3  4 4  3
The above binary tree is symmetric. But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
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
    public int isSymmetric(TreeNode A) {
        int ans = isSym(A.left,A.right);
        return ans;
    }
    public int isSym(TreeNode left,TreeNode right){
        if(left==null && right==null)
        return 1;
        if(left==null && right!=null)
        return 0;
        if(left!=null && right==null)
        return 0;
        int l=0,r=0;
        l=isSym(left.left,right.right);
        r=isSym(left.right,right.left);
        if(l==1 && r==1)
        return 1;
        else return 0;
    }
}
