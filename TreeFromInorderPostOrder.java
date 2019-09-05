/**
Given inorder and postorder traversal of a tree, construct the binary tree.
 Note: You may assume that duplicates do not exist in the tree. 
Example :
Input : 
        Inorder : [2, 1, 3]
        Postorder : [2, 3, 1]

Return : 
            1
           / \
          2   3
×
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
    ArrayList<Integer> postOrder = new ArrayList<Integer>();
    ArrayList<Integer> inOrder = new ArrayList<Integer>();
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        int len = B.size();
        postOrder = B;
        inOrder = A;
        for(int i=0;i<len;i++){
            map.put(A.get(i),i);
        }
        TreeNode root=createTree(0,len-1,0,len-1);
        return root;
    }
    public TreeNode createTree(int posts,int poste,int ins,int ine){
        if(posts==poste){
            TreeNode root = new TreeNode(postOrder.get(poste)); 
            return root;
        }else
        {
            int index = map.get(postOrder.get(poste));
            TreeNode root = new TreeNode(postOrder.get(poste)); 
            if(index!=ins)
            root.left=createTree(posts,poste-(ine-index)-1,ins,index-1);
            else
            root.left=null;
            if(index!=ine)
            root.right=createTree(poste-(ine-index),poste-1,index+1,ine);
            else
            root.right=null;
            return root;
        }
    }
}
