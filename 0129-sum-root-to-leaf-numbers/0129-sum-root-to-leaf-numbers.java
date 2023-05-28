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
    int result=0;
    public int sumNumbers(TreeNode root) {
        RootToLeafPath(root,"");
        return result;
    }
    
    public void RootToLeafPath(TreeNode node,String path){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            path +=node.val+"";
            result +=Integer.parseInt(path);
            return;
        }
        
        
        RootToLeafPath(node.left,path+node.val+"");
        RootToLeafPath(node.right,path+node.val+"");
    }
}