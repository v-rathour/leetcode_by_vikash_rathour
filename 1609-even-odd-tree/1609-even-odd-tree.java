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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> mq=new ArrayDeque<>();
        mq.add(root);
        // idx is used to specify the level of the binary tree
        int idx=0;
        while(!mq.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=mq.size();
            // it is used to treverse the Queue according to the level
            for(int i=0;i<size;i++){
                TreeNode node=mq.poll();
                // it is check the specify condition 
                if(idx%2==0){
                    
                   if(i!=0 || node.val%2==0){
                        if(node.val%2==0 || list.get(list.size()-1)>=node.val){
                              return false;
                        }
                   }
                    
                    list.add(node.val);
                }
                else{
                    // it is also check the condition
                    if(i!=0 || node.val%2!=0){
                        
                       if(node.val%2!=0 || list.get(list.size()-1)<=node.val){
                                return false;
                       }
                        
                    }
                    list.add(node.val);
                }
                
                if(node.left!=null){
                    mq.add(node.left);
                }
                
                if(node.right!=null){
                    mq.add(node.right);
                }
            }
            
            idx++;
        }
        
        return true;
    }
}