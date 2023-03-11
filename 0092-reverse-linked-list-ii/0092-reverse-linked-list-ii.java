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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
       ListNode currentNode=head;
       ListNode previous=null;
        while(left>1){
            previous=currentNode;
            currentNode=currentNode.next;
            left--;
            right--;
        
        }
        ListNode startNode=previous;
        ListNode tailNode=currentNode;
        ListNode temp=null;
        while(right>0){
            temp=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=temp;
            right--;
        }
        if(startNode!=null){
            startNode.next=previous;
        }
        else{
            head=previous;
        }
        tailNode.next=currentNode;
        return head;
        
    }
}