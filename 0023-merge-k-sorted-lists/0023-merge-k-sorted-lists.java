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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            new Comparator<ListNode>(){
            
                public int compare(ListNode o1,ListNode o2){
                    return o1.val-o2.val;
                }
            });
        
        for(ListNode ll:lists){
            if(ll != null){
                pq.add(ll);
            }
        }
        
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        
        while(!pq.isEmpty()){
            ListNode rv = pq.remove();
            Dummy.next = rv;
            Dummy = Dummy.next;
            if(rv.next != null){
                pq.add(rv.next);
            }
        }
        
        
        return temp.next;
    }
}