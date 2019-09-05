/**
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between). Example : Given binary tree
    3
   / \
  9  20
    /  \
   15   7
return
[
         [3],
         [20, 9],
         [15, 7]
]
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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
         Queue<TreeNode> queue = new LinkedList<TreeNode>();
         Stack<Integer> stack = new Stack<Integer>();
         queue.add(A);
         //stack.push(A.val);
         queue.add(null);
         ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
         ArrayList<Integer> list = new ArrayList<Integer>();
         int flag=0;
         while(queue.size()!=0){
             TreeNode node = queue.remove();
             if(node!=null){
             if(flag==1)
             list.add(stack.pop());
             if(flag==0)
             list.add(node.val);
             if(node.left!=null){
                 queue.add(node.left);
                 if(flag==0)
                 stack.push(node.left.val);
             }
             if(node.right!=null){
                 queue.add(node.right);
                 if(flag==0)
                 stack.push(node.right.val);
             }
             
             }
             else{
                 if(flag==0)
                 flag=1;
                 else
                 flag=0;
                 if(queue.size()!=0)
                 queue.add(null);
                 arr.add(new ArrayList<Integer>(list));
                 list.clear();
             }
         }
         return arr;
    }
}
