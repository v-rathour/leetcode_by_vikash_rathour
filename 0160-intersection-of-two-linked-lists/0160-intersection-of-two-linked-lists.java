/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashSet<ListNode> set=new HashSet<>();
        ListNode firstNode=headA;
        while(firstNode!=null){
            set.add(firstNode);
            firstNode=firstNode.next;
        }
        ListNode secondNode=headB;
        while(secondNode!=null){
            if(set.contains(secondNode)){
                return secondNode;
            }
            secondNode=secondNode.next;
        }
        
        return null;
    }
}