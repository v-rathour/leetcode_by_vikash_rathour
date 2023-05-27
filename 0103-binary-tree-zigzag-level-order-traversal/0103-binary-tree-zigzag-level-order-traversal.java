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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        
        Stack<TreeNode> mq=new Stack<>();
        Stack<TreeNode> sq=new Stack<>();
        mq.push(root);
        int i=0;
            
            List<Integer> list=new ArrayList<>();
            while(mq.size()>0){
                if(i%2==0){
                      TreeNode node=mq.pop();
                      list.add(node.val); 
                      if(node.left!=null){
                         sq.add(node.left);
                       }
                
                      if(node.right!=null){
                          sq.push(node.right);
                       }
                 }
                else{
                   TreeNode node=mq.pop();
                    list.add(node.val);
                    if(node.right!=null){
                          sq.push(node.right);
                     } 
                    if(node.left!=null){
                         sq.add(node.left);
                    }
                }
                
                if(mq.size()==0){
                    mq=sq;
                    sq=new Stack<>();
                    i++;
                    result.add(list);
                    list=new ArrayList<>();
                }
            }
        return result;
        
    }
}