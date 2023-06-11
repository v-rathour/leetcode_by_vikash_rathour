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
    int dep=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
         if(root==null)
             return 0;
        depthoftree(root,1);
        return dep;
    }
    
    public void depthoftree(TreeNode node,int count){
        if(node==null){
            return;
        }
        
        if(node.left==null && node.right==null){
             dep=Math.min(dep,count);
        }
        
        depthoftree(node.left,count+1);
        depthoftree(node.right,count+1);
    }
    
    
}