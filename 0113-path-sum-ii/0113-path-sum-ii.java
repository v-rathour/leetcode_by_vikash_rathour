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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        PathSum(root,targetSum,list,result,0);
        return result;
    }
    
    public void PathSum(TreeNode node ,int target,List<Integer> list,List<List<Integer>> result,int sum){
        
        if(node==null){
            return;
        }
        
        if(node.left==null && node.right==null){
            sum +=node.val;
            list.add(node.val);
            if(sum==target){
                result.add(new ArrayList(list));
            }
            list.remove(list.size()-1);
            return;
        }
        
        list.add(node.val);
        PathSum(node.left,target,list,result,sum+node.val);
        PathSum(node.right,target,list,result,sum+node.val);
        list.remove(list.size()-1);
    }
}