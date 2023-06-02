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
    public int maxLevelSum(TreeNode root) {
       if(root==null){
           return 1;
       } 
        int max=Integer.MIN_VALUE;
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        int level=0;
        int idx=1;
        while(!mq.isEmpty()){
            int size=mq.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=mq.poll();
                sum +=node.val;
                
                if(node.left!=null){
                    mq.add(node.left);
                }
                
                if(node.right!=null){
                    mq.add(node.right);
                }
            }
            
            if(max<sum){
                max=sum;
                level=idx;
            }
            
            idx++;
        }
        
        return level;
    }
}