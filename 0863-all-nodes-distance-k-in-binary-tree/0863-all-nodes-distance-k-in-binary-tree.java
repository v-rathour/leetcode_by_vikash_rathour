/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<Integer,List<Integer>> adj;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        adj = new HashMap<>();
        createGraph(root);
        
        return findKthdistanceElement(target,k);
    }
    
    public List<Integer> findKthdistanceElement(TreeNode target,int k){
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(target.val);
        
        if(k == 0){
            list.add(target.val);
            return list;
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(target.val);
        int i = 0;
        while(!q.isEmpty()){
             int size = q.size();
             i++;
             for(int j = 0;j<size;j++){
                 int rem = q.remove();
                 for(int nbrs : adj.get(rem)){
                     if(!set.contains(nbrs)){
                         q.add(nbrs);
                         if(i == k){
                             list.add(nbrs);
                         }
                         set.add(nbrs);
                     }

                 }
             }
            if(i == k){
                break;
            }
        }
        
        return list;
    }
    
    public void createGraph(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            TreeNode node = q.remove();
            if(!adj.containsKey(node.val)){
                adj.put(node.val,new ArrayList());
            }
            
            if(node.left != null){
                adj.get(node.val).add(node.left.val);
                if(!adj.containsKey(node.left.val)){
                    adj.put(node.left.val,new ArrayList<>());
                }
                adj.get(node.left.val).add(node.val);
                q.add(node.left);
            }
            
            if(node.right != null){
                adj.get(node.val).add(node.right.val);
                if(!adj.containsKey(node.right.val)){
                    adj.put(node.right.val,new ArrayList<>());
                }
                adj.get(node.right.val).add(node.val);
                q.add(node.right);
            }
            
        }
    }
}