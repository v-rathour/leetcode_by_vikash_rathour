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
        if(head.next==null || head==null){
            return head;
        }
        
        ListNode turtle=head;
        ListNode hare=head;
        
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        
        return turtle;
        
    }
}