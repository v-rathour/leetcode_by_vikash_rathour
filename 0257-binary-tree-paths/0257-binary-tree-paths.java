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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        root_to_leat_path(root,result,"");
        return result;
    }
    
    public void root_to_leat_path(TreeNode node,List<String> list,String str){
        if(node==null){
            return;
        }
        
        if(node.left==null && node.right==null){
            str +=node.val;
            list.add(str);
            return;
        } 
        
        root_to_leat_path(node.left,list,str+node.val+"->");
        root_to_leat_path(node.right,list,str+node.val+"->");
    }
}