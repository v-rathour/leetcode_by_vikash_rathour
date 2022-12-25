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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
           return head;
        ListNode currentNode=head;
        int n=1;
        while(currentNode.next!=null){
            n++;
            currentNode=currentNode.next;
        }
      
        k=k%n;
        if(k==0)
          return head; 
        ListNode secondNode=head;
        ListNode newnode=secondNode.next;
        int i=1;
        int j=n-k;
        while(i<j){
            secondNode=secondNode.next;
            newnode=secondNode.next;
            i++;
        }
        currentNode.next=head;
        secondNode.next=null;
        head=newnode;
        return head;
        
    }
}
