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
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            
            size++;
            curr=curr.next;
            
        }
        size /=2;
        int j=0;
        
        curr=head;
        
        ListNode pre=curr;
        while(j<size+1){
            pre=curr;
            curr=curr.next;
            j++;
        }
        
       ListNode NewNode=new ListNode(0);
       NewNode.next=pre;
       NewNode=pre;
       return NewNode;
        
    }
}