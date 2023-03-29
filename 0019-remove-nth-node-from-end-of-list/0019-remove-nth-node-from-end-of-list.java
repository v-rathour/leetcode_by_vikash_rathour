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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count=0;
        ListNode currentNode=head;
        while(currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }
        if(n==count)
            return head.next;
        ListNode NewNode=head;
        ListNode secondNode=NewNode;
        int i=0;
        while(i<count-n){
             secondNode=NewNode;
            NewNode =NewNode.next;
            i++;
        }
        secondNode.next=NewNode.next;
        return head;
    }
}