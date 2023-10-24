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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
             return new ArrayList<>();
        }
        
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        List<Integer> result=new ArrayList<>();
        while(!mq.isEmpty()){
              int size=mq.size();
              int max=Integer.MIN_VALUE;
              for(int i=0;i<size;i++){
                  TreeNode node=mq.poll();
                  
                  max=Math.max(max,node.val);
                  
                  if(node.left!=null){
                      mq.add(node.left);
                  }
                  
                  if(node.right!=null){
                      mq.add(node.right);
                  }
              }
            
            result.add(max);
        }
        
        return result;
    }
}