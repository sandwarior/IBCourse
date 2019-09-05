/**
Given a binary tree of integers. Return an array of integers representing the left view of the Binary tree.
Left view of a Binary Tree is a set of nodes visible when the tree is visited from Left side Constraints
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
    [1, 2, 4, 8]

Input 2:
            1
           /  \
          2    3
           \
            4
             \
              5
Output 2:
    [1, 2, 4, 5]
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
    int max = 0;
    public ArrayList<Integer> solve(TreeNode A) {
        leftView(A,1);
        return arr;
    }
    void leftView(TreeNode root,int cnt){
      
        if(cnt>max){
            max=cnt;
            arr.add(root.val);
        }
        if(root.left!=null)
        leftView(root.left,cnt+1);
        if(root.right!=null)
        leftView(root.right,cnt+1);
    }
}
