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
    public int amountOfTime(TreeNode root, int start) {
        
        Map<Integer, Set<Integer>> map = new HashMap<>();  
        
        convert(root, 0, map);
        
        Queue<Integer> q = new LinkedList<>(); 
        q.add(start);
        int ans = 0;
        
        
        HashSet<Integer> visited = new HashSet<>();
        visited.add(start);
          
        while (!q.isEmpty()) {
            int levelSize = q.size();
            
            for(int i = 0;i<levelSize; i++) {
                int current = q.poll();
                for (int num : map.get(current)) {
                    if (!visited.contains(num)) {
                        visited.add(num);
                        q.add(num);
                    }
                }
            }
            ans++;
        }
        return ans - 1;
    }
 
    public void convert(TreeNode current, int parent, Map<Integer, Set<Integer>> map){
        if (current == null) {
            return;
        } 
        
        if (!map.containsKey(current.val)) {
            map.put(current.val, new HashSet<>());
        } 
        
        Set<Integer> adjacentList = map.get(current.val);
        
        if (parent != 0) {
            adjacentList.add(parent);
        } 
        if (current.left != null) {
            adjacentList.add(current.left.val);
        } 
        if (current.right != null) {
            adjacentList.add(current.right.val);
        } 
        
        convert(current.left, current.val, map);
        convert(current.right, current.val, map);
    }      
}