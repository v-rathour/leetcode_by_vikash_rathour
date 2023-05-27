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
    public List<Integer> inorderTraversal(TreeNode root) {
        result=new ArrayList<>();
        Inorder(root);
        return result;
    }
    
    public void Inorder(TreeNode node){
        if(node==null){
            return ;
        }
        
        Inorder(node.left);
        result.add(node.val);
        Inorder(node.right);
    }
}