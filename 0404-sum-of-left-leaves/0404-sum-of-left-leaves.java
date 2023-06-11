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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        leafNodeChild(root,"");
        return sum;
    }
    
    public void leafNodeChild(TreeNode node,String str){
        if(node==null){
            return;
        }
        
        if(node.left==null && node.right==null){
            if(str=="l"){
                sum +=node.val;
            }
            
            return;
        }
        
        leafNodeChild(node.left,"l");
        leafNodeChild(node.right,"r");
    }
}