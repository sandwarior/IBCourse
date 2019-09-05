/**
Given preorder and inorder traversal of a tree, construct the binary tree.
 Note: You may assume that duplicates do not exist in the tree. 
Example :
Input :
        Preorder : [1, 2, 3]
        Inorder  : [2, 1, 3]

Return :
            1
           / \
          2   3
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
    ArrayList<Integer> preOrder = new ArrayList<Integer>();
    ArrayList<Integer> inOrder = new ArrayList<Integer>();
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        int len = B.size();
        preOrder = A;
        inOrder = B;
        for(int i=0;i<len;i++){
            map.put(B.get(i),i);
        }
        TreeNode root=createTree(0,len-1,0,len-1);
        return root;
    }
    public TreeNode createTree(int pres,int pree,int ins,int ine){
        if(pres==pree){
            TreeNode root = new TreeNode(preOrder.get(pres)); 
            return root;
        }else
        {
            int index = map.get(preOrder.get(pres));
            TreeNode root = new TreeNode(preOrder.get(pres)); 
            if(index!=ins)
            root.left=createTree(pres+1,pres+index-ins,ins,index-1);
            else
            root.left=null;
            if(index!=ine)
            root.right=createTree(pres+index-ins+1,pree,index+1,ine);
            else
            root.right=null;
            return root;
        }
    }
}
