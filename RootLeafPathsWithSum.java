/**
Root to Leaf Paths With Sum
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum. For example: Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
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
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        checkPath(A,0,B);
        return arr;
    }
    public void checkPath(TreeNode root,int sum,int B){
        sum +=root.val;
        list.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==B)
            arr.add(new ArrayList<Integer>(list));
        }else{
            if(root.left!=null){
            checkPath(root.left,sum,B);
            list.remove(list.size()-1);
            }
            if(root.right!=null){
            checkPath(root.right,sum,B);
            list.remove(list.size()-1);
            }
        }
    }
}
