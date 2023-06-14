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
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        fillElement(root);
        Collections.sort(list);
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<list.size()-1;i++){
            ans=Math.min(ans,list.get(i+1)-list.get(i));
        }
        
        return ans;
    }
    
    public void fillElement(TreeNode node){
        if(node==null){
            return;
        }
        
        list.add(node.val);
        
        fillElement(node.left);
        fillElement(node.right);
        
    }
}