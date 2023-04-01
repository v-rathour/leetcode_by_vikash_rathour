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
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            
            ListNode currentNode=lists[i];
            while(currentNode!=null){
                list.add(currentNode.val);
                currentNode=currentNode.next;
            }
            
        }
        
        Collections.sort(list);
        
        ListNode NewNode=new ListNode(0);
        ListNode pre=NewNode;
        
        for(int i=0;i<list.size();i++){
            ListNode Next=new ListNode(list.get(i));
            pre.next=Next;
            pre=Next;
        }
        
        return NewNode.next;
    }
}