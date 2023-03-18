/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        List<Integer> list=new ArrayList<>();
        
        ListNode currentNode=head;
        while(currentNode!=null){
            list.add(currentNode.val);
            currentNode=currentNode.next;
        }
        
        st.push(list.get(list.size()-1));
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i)>=st.peek()){
                st.push(list.get(i));
            }
        }
        ListNode NewNode=head;
        ListNode pre=NewNode;
        while(!st.isEmpty()){
            NewNode.val=st.peek();
            st.pop();
            pre=NewNode;
            NewNode=NewNode.next;
        }
        pre.next=null;
        return head;
    }
}