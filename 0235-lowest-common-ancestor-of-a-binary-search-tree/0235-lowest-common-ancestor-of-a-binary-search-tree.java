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
        List<Integer> list1=Distance(root,p.val);
        List<Integer> list2=Distance(root,q.val);
        int result=0;
        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                result=list1.get(i);
                break;
            }
        }
        
        TreeNode node=new TreeNode(result);
        
        return node;
    }
    
    public  List<Integer> Distance(TreeNode node,int target){

        if(node.val==target){
            List<Integer> list=new ArrayList<>();
            list.add(node.val);
            return list;
        }

        if(node.left!=null){
            List<Integer> list=Distance(node.left,target);
            if(list.size()>0){
                list.add(node.val);
                return list;
            }
        }
        if(node.right!=null){
            List<Integer> list=Distance(node.right,target);
            if(list.size()>0){
                list.add(node.val);
                return list;
            }
        }

        return new ArrayList<>();
    }
}