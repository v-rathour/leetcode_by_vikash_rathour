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
    public ListNode insertionSortList(ListNode head) {
        
         ListNode NewNode =new ListNode(-1);
         ListNode currentNode=head;
        
         while(currentNode!=null){
             ListNode temp=currentNode.next;
             ListNode dummy=NewNode.next;
             ListNode pre=NewNode;
             while( dummy!=null ){
                 if(dummy.val>currentNode.val)
                     break;
                 pre=dummy;
                 dummy=dummy.next;
             }
              
            currentNode.next=dummy;
             pre.next=currentNode;
             currentNode=temp;
         }
        
        return NewNode.next;
    }
    
}