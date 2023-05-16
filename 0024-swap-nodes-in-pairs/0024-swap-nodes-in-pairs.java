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
    public ListNode swapPairs(ListNode head) {
        ListNode currentNode=head;
        int count=0;
        while(currentNode!=null){
            count++;
            currentNode =currentNode.next;
        }
        currentNode=head;
        ListNode secondNode=currentNode;
        int i=1;
        while(i<=count){
            if(i%2==0){
                int tem=secondNode.val;
                secondNode.val=currentNode.val;
                currentNode.val=tem;
                
            }
            secondNode=currentNode;
            currentNode=currentNode.next;
            i++;
        }
        return head;
        
    }
}