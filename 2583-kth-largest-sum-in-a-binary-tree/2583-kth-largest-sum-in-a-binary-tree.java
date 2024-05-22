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
    
    
    
    public long kthLargestLevelSum(TreeNode root, int k) {
        
        List<Long> list = new ArrayList<>();
        BFS(root,list);
        Collections.sort(list);
        
        if(list.size()<k){
            return -1;
        }
        
        return list.get(list.size()-k);
        
    }
    
    public void BFS(TreeNode root,List<Long> list){
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            long sum = 0;
            
            for(int i = 0;i<size;i++){
                TreeNode rem = q.remove();
               
                sum += rem.val;
                
                if(rem.left != null){
                    q.add(rem.left);
                }
                
                if(rem.right != null){
                    q.add(rem.right);
                }
            }
            
            list.add(sum);
        }
    }
}