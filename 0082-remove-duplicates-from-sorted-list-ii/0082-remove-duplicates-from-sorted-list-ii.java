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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode NewNode=new ListNode(0,head);
        ListNode prev=NewNode;
        while(head!=null){

            if(head.next!=null && head.val==head.next.val){

                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next=head.next;
            }
            else{
                prev=prev.next;
            }
            head=head.next;
        }

        return NewNode.next;
    }
}