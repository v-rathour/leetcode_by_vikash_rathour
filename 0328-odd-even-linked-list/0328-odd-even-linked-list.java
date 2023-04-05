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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null ){
            return head;
        }
        ListNode listnode=new ListNode(0);
        ListNode NewNode=listnode;
        
        ListNode even=head;
        while(even!=null && even.next!=null){
            ListNode Next=new ListNode(even.val);
            NewNode.next=Next;
            NewNode=Next;
            even=even.next.next;
        }
        if(even!=null){
            ListNode Next=new ListNode(even.val);
            NewNode.next=Next;
            NewNode=Next;
        }
        ListNode odd=head.next;
        while(odd!=null && odd.next!=null){
            ListNode Next=new ListNode(odd.val);
            NewNode.next=Next;
            NewNode=Next;
            
            odd=odd.next.next;
        }
        
        if(odd!=null){
            ListNode Next=new ListNode(odd.val);
            NewNode.next=Next;
            NewNode=Next;
        }
        
        
      return listnode.next;
        
    }
}