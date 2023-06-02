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
    int height=0;
    int result=0;
    public int findBottomLeftValue(TreeNode root) {
        FindElement(root,1);
        return result;
    }
    
    public void FindElement(TreeNode node,int depth){
        
        if(node==null){
            return;
        }
        
        if(node.left==null){
            if(height<depth){
                height=depth;
                result=node.val;
            }
        }
        FindElement(node.left,depth+1);
        FindElement(node.right,depth+1);
    }
}