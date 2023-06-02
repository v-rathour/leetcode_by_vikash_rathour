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
    public class Pair{
        TreeNode node;
        int idx=0;
        
        public Pair(TreeNode root,int idx){
            this.node=root;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> mq=new ArrayDeque<>();
        Pair rp=new Pair(root,0);
        mq.add(rp);
        int max=0;
        while(!mq.isEmpty()){
            int size=mq.size();
            int lidx=mq.peek().idx;
            int ridx=mq.peek().idx;
            while(size-->0){
                Pair top=mq.poll();
                ridx=top.idx;
                
                if(top.node.left!=null){
                    mq.add(new Pair(top.node.left,top.idx*2+1));
                }
                
                if(top.node.right!=null){
                    mq.add(new Pair(top.node.right,top.idx*2+2));
                }
            }
            
            max=Math.max(max,ridx-lidx+1);
        }
        
        return max;
    }
}