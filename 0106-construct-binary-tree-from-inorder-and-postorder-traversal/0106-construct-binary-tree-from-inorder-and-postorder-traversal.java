/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return CreateTree(inorder,0,n-1,postorder,0,n-1);
    }
    
    public TreeNode CreateTree(int[] inorder,int isi,int iei,int[] postorder,int psi,int pei){
        if(isi>iei){
            return null;
        }
        
        int idx=isi;
        while(postorder[pei]!=inorder[idx]){
            idx++;
        }
        
        int colse=idx-isi;
        
        TreeNode node=new TreeNode(postorder[pei]);
        
        node.left=CreateTree(inorder,isi,idx-1,postorder,psi,psi+colse-1);
        node.right=CreateTree(inorder,idx+1,iei,postorder,psi+colse,pei-1);
        
        return node;
    }
}