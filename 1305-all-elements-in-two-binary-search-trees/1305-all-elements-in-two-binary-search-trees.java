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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list=new ArrayList<>();
        AddElement(root1,list);
        AddElement(root2,list);
        Collections.sort(list);
        return list;
    }
    
    public void AddElement(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            int size=st.size();
            
            for(int i=0;i<size;i++){
                TreeNode top=st.pop();
                
                list.add(top.val);
                
                if(top.left!=null){
                    st.push(top.left);
                }
                
                if(top.right!=null){
                    st.push(top.right);
                }
            }
        }
    }
}