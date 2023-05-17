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
    public void reorderList(ListNode head) {
          
        int n=0;
        ListNode curr=head;
        
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        
        List<Integer> list=new ArrayList<>();
        ListNode currentNode=head;
        int k=n/2;
        if(n%2==0){
            int i=0;
            while(i<(n-k)){
                currentNode=currentNode.next;
                i++;
            }
        }
        else{
            int i=1;
            while(i<(n+1)-k){
                currentNode=currentNode.next;
                i++;
            }
        }
        
        while(currentNode!=null){
            list.add(currentNode.val);
            currentNode=currentNode.next;
        }
        Collections.reverse(list);
        ListNode NewNode=head;
        if(n%2==0){
            int i=1;
            while(i<(n-k)){
               ListNode Next=NewNode.next;
                ListNode current=new ListNode(list.get(0));
                current.next=Next;
                NewNode.next=current;
                list.remove(Integer.valueOf(list.get(0)));
                NewNode=Next;
                i++;
            }
            NewNode.next.next=null;
        }
        else{
            int i=1;
            while(i<(n-k)){
               ListNode Next=NewNode.next;
                ListNode current=new ListNode(list.get(0));
                current.next=Next;
                NewNode.next=current;
                list.remove(Integer.valueOf(list.get(0)));
                NewNode=Next;
                i++;
            }
            NewNode.next=null;
        }
        
        
    }
}