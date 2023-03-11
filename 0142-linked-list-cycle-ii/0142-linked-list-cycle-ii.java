/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        //create the Hashset of ListNode type
        HashSet<ListNode> list=new HashSet<>();
       ListNode NewNode=head;
       while(NewNode!=null){
           // check that any node is add allready or not 
           if(list.contains(NewNode)==true){
              // return node if node is repeat again
               return NewNode;
           }
           // add the node in the Hashset
           list.add(NewNode);
           NewNode=NewNode.next;
       }
       return null;
        
    }
}