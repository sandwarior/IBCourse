/**
Given a binary tree with N nodes. Check whether it is possible to partition the tree to two trees which have equal sum of values after removing exactly one edge on the original tree. Return 1 if the tree can be partitioned into two trees of equal sum else return 0. Constraints
 2 <= N <= 100000
-10^9 <= Node values <= 10^9
For Example
Input 1:
                5
               /  \
              3    7
             / \  / \
            4  6  5  6
Output 1:
    1
    Explanation 1:
        Remove edge between 5(root node) and 7: 
        Tree 1 =                                               Tree 2 =
                        5                                                     7
                       /                                                     / \
                      3                                                     5   6    
                     / \
                    4   6
        Sum of Tree 1 = Sum of Tree 2 = 18

Input 2:
                1
               / \
              2   10
                  / \
                 20  2
Output 2:
     0
     Explanation 2:
        The given Tree cannot be partitioned.
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
    int flag=0;
    public int solve(TreeNode A) {
        int sum = preOrderSum(A);
       // System.out.println(sum);
        if(sum%2!=0)
        return 0;
        else
        check(A,sum);
        if(flag==1)
        return 1;
        else
        return 0;
    }
    public int  preOrderSum(TreeNode root){
        if(root.left==null && root.right==null)
        return root.val;
        else{
        int left=0,right=0; 
        if(root.left!=null)
        left = preOrderSum(root.left);
        if(root.right!=null)
        right=preOrderSum(root.right);
        return right+left+root.val;
        }
        
    }
    public int check(TreeNode root,int sum){
        if(root.left==null && root.right==null)
        return root.val;
        else{
        int left=0,right=0,rsum=0; 
        if(root.left!=null){
        left = check(root.left,sum);
        if(sum-left==left)
        flag=1;
        }
        if(root.right!=null){
        right=check(root.right,sum);
        if(sum-right==right)
        flag=1;
        }
       // System.out.println(left+" "+right+" "+flag);
        
        
        rsum = right+left+root.val;
        return rsum;
        }
    }
}
