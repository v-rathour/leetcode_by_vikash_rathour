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
    int floor=Integer.MAX_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        int factor=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            SmallestNode(root,factor);
            factor=floor;
            floor=Integer.MAX_VALUE;
        }
        
        return factor;
    }
    
    public void SmallestNode(TreeNode node,int factor){
        if(node==null){
            return;
        }
        if(node.val>factor){
            if(node.val<floor){
                floor=node.val;
            }
        }
        
        SmallestNode(node.left,factor);
        SmallestNode(node.right,factor);
    }
}