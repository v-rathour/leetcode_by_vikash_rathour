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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> plist=CommonAncestor(root,p);
        List<TreeNode> qlist=CommonAncestor(root,q);
        
        for(TreeNode node:plist){
            if(qlist.contains(node)){
                return node;
            }
        }
        
        return null;
    }
    
    public List<TreeNode> CommonAncestor(TreeNode node, TreeNode p){
        
        if(node==null){
            return new ArrayList<>();
        }
        
        if(node.val==p.val){
            List<TreeNode> list=new ArrayList<>();
            list.add(node);
            return list;
        }
        
        if(node.left!=null){
            List<TreeNode> list=CommonAncestor(node.left,p);
            if(list.size()>0){
                list.add(node);
                return list;
            }
        }
        
        if(node.right!=null){
            List<TreeNode> list=CommonAncestor(node.right,p);
            if(list.size()>0){
                list.add(node);
                return list;
            }
        }
        
        return new ArrayList<>();
    }
}