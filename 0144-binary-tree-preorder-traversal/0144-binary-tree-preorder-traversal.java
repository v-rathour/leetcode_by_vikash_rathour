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
    static List<Integer> result;
    public List<Integer> preorderTraversal(TreeNode root) {
        result=new ArrayList<>();
        PreOrder(root);
        return result;
        
    }
    
    public void PreOrder(TreeNode node){
        if(node==null){
            return;
            
        }
        
        result.add(node.val);
        PreOrder(node.left);
        PreOrder(node.right);
    }
}