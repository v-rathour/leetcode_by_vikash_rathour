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
    int path=0;
    public int longestZigZag(TreeNode root) {
        MaximumPath(root,root,"",0);
        return path;
    }
    public void MaximumPath(TreeNode node,TreeNode root,String str,int count){
        if(node==null)
            return;
        
        path=Math.max(path,count);
        
        if(str=="r" || node==root){
             MaximumPath(node.left,root,"l",count+1);
        }
        else{
            MaximumPath(node.left,root,"l",1);
        }
        
        if(str=="l" || node==root){
             MaximumPath(node.right,root,"r",count+1);
        }
        else{
            MaximumPath(node.right,root,"r",1);
        }
    }
}