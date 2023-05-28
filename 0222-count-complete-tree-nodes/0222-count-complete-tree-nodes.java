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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int countNode=0;
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        while(!mq.isEmpty()){
            int size=mq.size();
            for(int i=0;i<size;i++){
                TreeNode node=mq.poll();
                countNode++;
                
                if(node.left!=null)
                    mq.add(node.left);
                if(node.right!=null)
                    mq.add(node.right);
            }
        }
        
        return countNode;
    }
}