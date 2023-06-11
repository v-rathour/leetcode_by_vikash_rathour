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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return BinaryTree(p,q);
    }
    
    public boolean BinaryTree(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        
        if(node1==null && node2!=null || node1!=null && node2==null || node1.val!=node2.val){
            return false;
        }
        
        boolean leftB=BinaryTree(node1.left,node2.left);
        if(leftB==false){
            return false;
        }
        boolean rightB=BinaryTree(node1.right,node2.right);
        if(rightB==false){
            return false;
        }
        
        return true;
    }
}