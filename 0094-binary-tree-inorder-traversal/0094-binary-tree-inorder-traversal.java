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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        InorderTraversal(root,list);
        return list;
    }
    
    public void InorderTraversal(TreeNode root,List<Integer> list){
        
        if(root == null){
            return;
        }
        
        InorderTraversal(root.left,list);
        list.add(root.val);
        InorderTraversal(root.right,list);
    }
}