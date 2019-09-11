/**
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number. An example is the root-to-leaf path 1->2->3 which represents the number 123. Find the total sum of all root-to-leaf numbers % 1003. Example :
    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12. The root-to-leaf path 1->3 represents the number 13. Return the sum = (12 + 13) % 1003 = 25 % 1003 = 25.
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
    int total=0;
    public int sumNumbers(TreeNode A) {
        checkPath(A,0);
        return total;
    }
    public void checkPath(TreeNode root,int sum){
        sum =(((sum*10)%1003)+(root.val))%1003;
        if(root.left==null && root.right==null){
            total = (total + sum)%1003;
        }else{
            if(root.left!=null)
            checkPath(root.left,sum);
            if(root.right!=null)
            checkPath(root.right,sum);
        }
    }
}
