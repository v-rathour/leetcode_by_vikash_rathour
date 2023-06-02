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
    public int diameterOfBinaryTree(TreeNode root) {
        return DiameterOfTree(root);
    }
    
    public  int DiameterOfTree(TreeNode node){
        if(node==null){
            return 0;
        }

        int leftheight= DiameterOfTree(node.left);
        int rightheight=DiameterOfTree(node.right);

        int factor= heigth(node.left)+heigth(node.right)+2;

        int dia=Math.max(factor,Math.max(leftheight,rightheight));

        return dia;
    }
    
    public  int heigth(TreeNode node){
        if(node==null){
            return -1;
        }

        int leftHeigth=heigth(node.left);
        int rightHeight=heigth(node.right);
        int maximum=Math.max(leftHeigth,rightHeight);

        return maximum+1;
    }
}