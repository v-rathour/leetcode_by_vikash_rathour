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
    public ListNode reverse(ListNode head){
        ListNode previous=null;
        ListNode currentNode=head;
        
        while(currentNode!=null){
            
            ListNode Next=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=Next;
        }
        return previous;
    }
    public  ListNode findMiddle(ListNode head){
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;

        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findMiddle(head);
        ListNode secondstart=reverse(middle.next);
        
        ListNode currentNode=head;
        while(secondstart!=null){
            if(secondstart.val!=currentNode.val){
                return false;
            }
            secondstart=secondstart.next;
            currentNode=currentNode.next;
        }
        
        return true;
        
    }
}