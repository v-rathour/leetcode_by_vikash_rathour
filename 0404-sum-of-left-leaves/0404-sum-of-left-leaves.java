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
    public int sumOfLeftLeaves(TreeNode root) {
        return Sum_of_leftNode(root,-1);
        
    }
    
    public int Sum_of_leftNode(TreeNode root,int flag){
        
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            if(flag == 1){
                return root.val;
            }
        }
        
        int left = Sum_of_leftNode(root.left,1);
        int right = Sum_of_leftNode(root.right,0);
        
        
        return left+right;
    }
}