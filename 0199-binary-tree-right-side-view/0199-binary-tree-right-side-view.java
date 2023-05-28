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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=rightSidePath(root);
        return list;
    }
    
    public List<Integer> rightSidePath(TreeNode node){
        if(node==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(node);
        List<Integer> list=new ArrayList<>();
        while(!mq.isEmpty()){
            
            int size=mq.size();
            
            for(int i=0;i<size;i++){
                TreeNode top=mq.poll();
                if(i==size-1){
                    list.add(top.val);
                }
                
                if(top.left!=null){
                    mq.add(top.left);
                }
                if(top.right!=null){
                    mq.add(top.right);
                }
            }
        }
        
        return list;
    }
}