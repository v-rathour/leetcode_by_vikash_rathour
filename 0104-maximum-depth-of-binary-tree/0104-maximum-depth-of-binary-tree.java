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
    int dep=0;
    public int maxDepth(TreeNode root) {
        DepthOfTree(root,1);
        return dep; 
    }
    
    public void DepthOfTree(TreeNode node,int count){
        if(node==null){
            return;
        }
        
        dep=Math.max(dep,count);
        
        DepthOfTree(node.left,count+1);
        DepthOfTree(node.right,count+1);
    }
    
    
    
}