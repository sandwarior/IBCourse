/**
Given a binary tree of integers. Find the difference between the sum of nodes at odd level and sum of nodes at even level. Note: Consider the level of root node as 1. Constraints
1 <= Number of nodes in binary tree <= 100000
0 <= node values <= 10^9 
For Example
Input 1:
            1
          /   \
         2    3
        / \  / \
       4   5 6  7
      /
     8 
Output 1:
    10
    Sum of nodes at odd level = 23
    Sum of ndoes at even level = 13

Input 2:
            1
           /  \
          2    10
           \
            4
Output 2:
    -7
    Sum of nodes at odd level = 5
    Sum of ndoes at even level = 12
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
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    long sum1=0;
    long sum2 = 0;
    int lvl = 0;
    public int solve(TreeNode A) {
        queue.add(A);
        queue.add(null);
        while(queue.size()!=0){
            TreeNode node = queue.poll();
            if(node!=null){
                if(lvl%2==0)
                    sum1+=node.val;
                else
                    sum2+=node.val;
                if(node.left!=null)
                queue.add(node.left);
                if(node.right!=null)
                queue.add(node.right);
            }else{
                if(queue.size()>0)
                queue.add(null);
                lvl++;
                
            }
        }
        return (int)(sum1-sum2);
    }
}
