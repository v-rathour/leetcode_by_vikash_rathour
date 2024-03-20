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
    
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode FirstNode = list1;
        ListNode First_a = null;
        ListNode First_b = null;
        int node = 0;
        while(FirstNode != null){
            if(node == a-1){
                First_a = FirstNode;
            }
            
            if(node == b+1){
                First_b = FirstNode;
            }
            node++;
            FirstNode = FirstNode.next;
        }
        
        ListNode secondcurr = list2;
        
        while(secondcurr.next != null){
            secondcurr = secondcurr.next;
        }
        
        First_a.next = list2;
        secondcurr.next = First_b;
        
        return list1;
        
        
    }
}