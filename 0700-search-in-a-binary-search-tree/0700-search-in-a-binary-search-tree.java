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
    public TreeNode searchBST(TreeNode root, int val) {
        
        return SearchNode(root,val);
    }
    
    public TreeNode SearchNode(TreeNode node,int val){
        
        if(node==null){
            return null;
        }
        
        if(node.val==val){
            return node;
        }
        
        if(node.val<val){
           return SearchNode(node.right,val);
        }
        else{
           return SearchNode(node.left,val);
        }
    }
}