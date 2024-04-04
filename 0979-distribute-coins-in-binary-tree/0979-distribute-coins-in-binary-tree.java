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
    int ans = 0 ;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        DistributeCoins(root);
        return ans;
    }
    
    public int DistributeCoins(TreeNode root ){
        if(root == null){
            return 0;
        }
        
        int left = DistributeCoins(root.left);
        int right = DistributeCoins(root.right);
        
        // System.out.println(left+" "+right);
        
        ans += Math.abs(left)+Math.abs(right);
        
        // System.out.println(ans);
        
        return (left+right+root.val-1);
    }
}