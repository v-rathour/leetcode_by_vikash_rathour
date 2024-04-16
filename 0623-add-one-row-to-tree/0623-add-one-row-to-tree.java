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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return Add_New_Node(root,val,depth,1);
    }
    
    public TreeNode Add_New_Node(TreeNode root,int val,int depth,int k){
        
        Queue<TreeNode> q = new LinkedList<>();
        
        
        if(depth == 1){
            TreeNode NewNode1 = new TreeNode(val);
            NewNode1.left= root;
            root = NewNode1;
        }
        
        q.add(root);
        
        while(!q.isEmpty()){
            k++;
            int size = q.size();
            for(int i = 0;i<size;i++){
                TreeNode rem = q.remove();
                if(depth == k){
                    TreeNode NewNode1 = new TreeNode(val);
                    if(rem.left == null){
                        rem.left = NewNode1;
                    }
                    else{
                        TreeNode temp = rem.left;
                        rem.left = NewNode1;
                        NewNode1.left = temp;
                    }
                    
                    TreeNode NewNode2 = new TreeNode(val);
                    if(rem.right == null){
                        rem.right = NewNode2;
                    }
                    else{
                        TreeNode temp = rem.right;
                        rem.right = NewNode2;
                        NewNode2.right = temp;
                    }
                }
                
                if(rem.left != null){
                    q.add(rem.left);
                }
                
                if(rem.right != null){
                    q.add(rem.right);
                }
                
            }
            
            if(depth == k){
                break;
            }
        }
        
        return root;
    }
}