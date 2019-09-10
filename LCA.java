/**
Find the lowest common ancestor in an unordered binary tree given two values in the tree.
 Lowest common ancestor : the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic graph (DAG) is the lowest (i.e. deepest) node that has both v and w as descendants. 
Example :
        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2_     0        8
         /   \
         7    4
For the above tree, the LCA of nodes 5 and 1 is 3.
 LCA = Lowest common ancestor 
Please note that LCA for nodes 5 and 4 is 5.
ou are given 2 values. Find the lowest common ancestor of the two nodes represented by val1 and val2
No guarantee that val1 and val2 exist in the tree. If one value doesn't exist in the tree then return -1.
There are no duplicate values.
You can use extra memory, helper functions, and can modify the node struct but, you can't add a parent pointer.
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
    int b,c,flag=0;
    public int lca(TreeNode A, int B, int C) {
        b=B;
        c=C;
        int ans = LCA(A);
        if(flag==0 && b==c)
        return ans;
        else if (flag==0)
        return -1;
        else
        return ans;
    }
    public int LCA(TreeNode root){
        int left=-1,right=-1;
        int r = -1,ans = -1;
        if(root.left==null && root.right==null)
        ans= -1;
        
        if(root.left!=null)
        left = LCA(root.left);
        if(root.right!=null)
        right = LCA(root.right);
        if(left!=-1 && right!=-1){
        flag=1;
        return  root.val;
        }
        if(root.val==b)
        ans=b;
        if(root.val==c)
        ans=c;
        
        if((left!=-1 && ans!=-1) || (right!=-1 && ans!=-1)){
            flag=1;
            return ans;
        }
        if(left!=-1)
        ans =  left;
        if(right!=-1)
        ans =  right;
        return ans;
    }
}
