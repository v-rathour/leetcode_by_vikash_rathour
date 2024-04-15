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
    public int sumNumbers(TreeNode root) {
        return TotalSum(root,"");
    }
    
    public int TotalSum(TreeNode root,String path){
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            path += root.val;
            return Integer.parseInt(path);
        }
        
        int ans = 0;
        int left = TotalSum(root.left,path+root.val);
        int right = TotalSum(root.right,path+root.val);
        
        return left+right;
    }
}