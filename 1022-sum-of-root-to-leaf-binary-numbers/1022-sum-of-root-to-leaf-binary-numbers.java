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
    public int sumRootToLeaf(TreeNode root) {
        return sumrootToleaf(root,"");
    }
    
    public int sumrootToleaf(TreeNode node,String str){
        if(node==null){
            return 0;
        }
        
        if(node.left==null && node.right==null){
            str +=node.val;
            
            int i=0;
            int ans=0;
            int j=str.length()-1;
            while(j>=0){
                char ch=str.charAt(j);
                int rev=Integer.parseInt(ch+"");
                ans +=(rev*Math.pow(2,i));
                j--;
                i++;
            }
            return ans;
        }
        int sum=0;
        sum +=sumrootToleaf(node.left,str+node.val+"");
        sum +=sumrootToleaf(node.right,str+node.val+"");
        
        return sum;
    }
    
    
}