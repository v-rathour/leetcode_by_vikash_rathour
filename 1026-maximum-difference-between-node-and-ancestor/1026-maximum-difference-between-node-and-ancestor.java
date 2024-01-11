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
    
    public class Pair{
        int minval ;
        int maxval;
        int ans;
        
        public Pair(int min,int max,int ans){
             this.minval = min;
             this.maxval = max;
             this.ans = ans;
        }
    }
    
    public int maxAncestorDiff(TreeNode root) {
        
        Pair rem = Maximum_diff(root);
        return rem.ans;
    }
    
    public Pair Maximum_diff(TreeNode root){
        
        if(root == null){
          return new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        
        Pair leftPair = Maximum_diff(root.left);
        Pair rightPair = Maximum_diff(root.right);
        
        int min = Math.min(root.val,Math.min(leftPair.minval,rightPair.minval));
        int max = Math.max(root.val,Math.max(leftPair.maxval,rightPair.maxval));
        
        int leftmindiff = 0;
        if(leftPair.minval != Integer.MAX_VALUE){
            leftmindiff = Math.abs(root.val-leftPair.minval);
        }
        
        int leftmaxdiff = 0;
        if(leftPair.maxval != Integer.MIN_VALUE){
           leftmaxdiff = Math.abs(root.val-leftPair.maxval);
        }
        
        int rightmaxdiff = 0;
        if(rightPair.maxval != Integer.MIN_VALUE){
           rightmaxdiff = Math.abs(root.val-rightPair.maxval);
        }
        
        int rightmindiff = 0;
        if(rightPair.minval != Integer.MAX_VALUE){
            rightmindiff = Math.abs(root.val-rightPair.minval);
        }
        
        int ans = Math.max(Math.max(leftPair.ans,rightPair.ans), Math.max(Math.max(leftmindiff,leftmaxdiff),Math.max(rightmindiff,rightmaxdiff)));
        
        return new Pair(min,max,ans);
    }
    
    
}