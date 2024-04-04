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
    int ans = 0;
    public int minCameraCover(TreeNode root) {
        ans = 0;
        int need = Camera(root);
        if(need == -1){
            ans++;
        }
        return ans;
    }
    
    public int Camera(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int left = Camera(root.left);
        int right = Camera(root.right);
        
        if(left == -1 || right == -1){
            ans++;
            return 1;
        }else if(left == 1 || right == 1){
            return 0;
        }
        else{
            return -1;
        }
        
    }
}