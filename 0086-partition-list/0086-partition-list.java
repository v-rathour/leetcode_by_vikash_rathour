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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode NewList1=new ListNode(-1);
        ListNode NewList2=new ListNode(-1);
        
        ListNode NewNode1=NewList1;
        ListNode NewNode2=NewList2;
        
        ListNode currentNode=head;
        
        while(currentNode!=null){
            if(currentNode.val<x){
                NewNode1.next=currentNode;
                NewNode1=currentNode;
                
            }
            else{
                 NewNode2.next=currentNode;
                NewNode2=currentNode;
            }
            currentNode=currentNode.next;
        }
        
        NewNode1.next=null;
        NewNode2.next=null;
        
        NewNode1.next=NewList2.next;
        return NewList1.next;
    }
}