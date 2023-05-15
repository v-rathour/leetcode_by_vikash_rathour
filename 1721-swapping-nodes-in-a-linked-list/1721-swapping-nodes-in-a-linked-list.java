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
    public ListNode swapNodes(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        
        ListNode currentNode=head;
        int i=1;
        
        while(i<k && currentNode!=null){
            currentNode=currentNode.next;
            i++;
        
        }
          
        int j=1;
        ListNode secondNode=head;
        
        while(j<=(n-k) && secondNode!=null){
            secondNode=secondNode.next;
            j++;
        }
        int temp=currentNode.val;
        currentNode.val=secondNode.val;
        secondNode.val=temp;
        
        return head;
    }
}