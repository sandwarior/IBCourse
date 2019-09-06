/**
Given a binary tree with root node pointer A and an integer B. A number S is lost in the tree but you somehow find how to restore it. S is formed by concatenating all the node values from left to right at level B. Find and return the number S. If there are no nodes at level B then return an empty string. Note: Consider the level of root node as 0. 
Input Format
The first arguments given is root pointer A.
The second argument is an integer B.
Output Format
Return the string S denoting the number.
Constraints
1 <= Total number of nodos <= 100000
0 < = Nodes values <= 9
1 <= B <= 100 
For Example
Input 1:

       1
      / \
     2   3
    / \  \
   3   4  5

   B = 1

Output 1:
    "23"
    Explanation 1:
        Nodes at level 1: 2 and 3

Input 2:

       7
      / \
     2   3
    / \  \
   0   1  0

   B = 2

Output 1:
    "010"
    Explanation 1:
        Nodes at level 1: 0, 1,and 0    
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
    public String solve(TreeNode A, int B) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(A);
        queue.add(null);
        while(level!=B){
            TreeNode node = queue.remove();
            if(node!=null){
                if(node.left!=null)
                queue.add(node.left);
                if(node.right!=null)
                queue.add(node.right);
            }else
            {
                queue.add(null);
                level++;
            }
        }
        String s="";
        while(queue.peek()!=null){
            s+=queue.remove().val;
        }
        return s;
    }
}
