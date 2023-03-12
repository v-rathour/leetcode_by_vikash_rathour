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
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous=null;
        ListNode currentNode=head;
        
        while(currentNode!=null){
           
            if(currentNode.val==val){
                if(previous==null){
                    head=head.next;
                    
                }
                else{
                    previous.next=currentNode.next;
                    
                }
            }
            else{
                previous=currentNode;
            }
            
            currentNode=currentNode.next;
        }
        return head;
    }
}