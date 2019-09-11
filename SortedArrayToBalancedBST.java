/**
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 
Example :
Given A : [1, 2, 3]
A height balanced BST  : 

      2
    /   \
   1     3
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> list = new ArrayList<Integer>();
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    int len = a.size();
	    list=a;
	    TreeNode root = createBST(0,len-1);
	    return root;
	}
	public TreeNode createBST(int start,int end){
	    if(start==end){
	        TreeNode node = new TreeNode(list.get(start));
	        node.left = null;
	        node.right = null;
	        return node;
	    }else{
	        int mid = (start+end)/2;
	        TreeNode node = new TreeNode(list.get(mid));
	        if(start!=mid)
	        node.left = createBST(start,mid-1);
	        if(end!=mid)
	        node.right = createBST(mid+1,end);
	        return node;
	    }
	}
}
