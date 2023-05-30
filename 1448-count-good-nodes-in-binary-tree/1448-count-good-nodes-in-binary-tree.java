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
    static int count;
    public int goodNodes(TreeNode root) {
        count=0;
        GoodNode(root,new ArrayList<>());
        
        return count;
        
    }
    
    public void GoodNode(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        list.add(node.val);
        int max=Collections.max(list);
        if(max<=node.val){
            count++;
        }
        GoodNode(node.left,list);
        GoodNode(node.right,list);
        list.remove(list.size()-1);
    }
}