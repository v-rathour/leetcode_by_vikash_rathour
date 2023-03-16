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
    public ListNode mergeNodes(ListNode head) {
        ListNode NewNode=new ListNode(0);
        ListNode pre=NewNode;
        
        int sum=0;
        ListNode currentNode=head.next;
        while(currentNode!=null){
            sum=sum+currentNode.val;
            if(currentNode.val==0 && sum!=0){
                
                ListNode NextNode=new ListNode(sum);
                pre.next=NextNode;
                pre=NextNode;
                sum=0;
            }
            currentNode=currentNode.next;
        }
        return NewNode.next;
    }
}