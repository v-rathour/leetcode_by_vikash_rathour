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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode currentNode = head;
        
        while(currentNode.next != null){
            int divisor = greatestCommonDivisor(currentNode.val,
                                                currentNode.next.val);
            ListNode NewNode = new ListNode(divisor);
            NewNode.next = currentNode.next;
            currentNode.next = NewNode;
            
            currentNode = NewNode.next;
        }
        
        return head;
    }
    
    public int greatestCommonDivisor(int a, int b){
        int min = Math.min(a,b);
        
        while(a%min != 0 || b%min != 0){
            min--;
        }
        
        return min;
    }
}