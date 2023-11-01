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
    public int[] findMode(TreeNode root) {
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            
            TreeNode temp = q.poll();
            if(temp.left != null){
                 q.add(temp.left);
            }
            
            if(temp.right != null){
                q.add(temp.right);
            }
            
            if(!map.containsKey(temp.val)){
                map.put(temp.val,1);
            }
            else{
                map.put(temp.val,map.get(temp.val)+1);
            }
            max = Math.max(max,map.get(temp.val));
            
        }
        
        List<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            
            if(map.get(num) == max){
                list.add(num);
            }
            
        }
        
        int arr[] = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        
        return arr;
        
    }
    
    
}