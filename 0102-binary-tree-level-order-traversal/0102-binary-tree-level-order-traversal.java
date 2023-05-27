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
    public List<List<Integer>> levelOrder(TreeNode root) {
        return LevelTraversal(root);
    }
     public List<List<Integer>> LevelTraversal(TreeNode root){
        List<List<Integer>> result=new ArrayList<>(); 
        Queue<TreeNode> mq=new ArrayDeque<>();
         if(root==null){
             return result;
         }
        mq.add(root);
        while(mq.size()>0){
            int size=mq.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode child=mq.poll();
                list.add(child.val);

                if(child.left!=null){
                    mq.add(child.left);
                }
                if(child.right!=null){
                    mq.add(child.right);
                }
            }
            result.add(list);
        }
         
        return result;
    }
}