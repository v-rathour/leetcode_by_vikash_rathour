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
    public TreeNode bstToGst(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            TreeNode rem = q.remove();
            list.add(rem.val);
            
            if(rem.left != null)
                q.add(rem.left);
            if(rem.right != null)
                q.add(rem.right);
            
        }
        
        Collections.sort(list);
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = list.size()-1;i>=0;i--){
            sum += list.get(i);
            map.put(list.get(i),sum);
        }
        
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rem = q.remove();
            rem.val = map.get(rem.val);
            if(rem.left != null)
                q.add(rem.left);
            if(rem.right != null)
                q.add(rem.right);
        }
        
        return root;
        
    }
    
    
}