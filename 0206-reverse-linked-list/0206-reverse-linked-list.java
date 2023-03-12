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
    public ListNode reverseList(ListNode head) {
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
}