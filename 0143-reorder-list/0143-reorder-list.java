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
        
        List<ListNode> list=new ArrayList<>();
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
            list.add(currentNode);
            currentNode=currentNode.next;
        }
        Collections.reverse(list);
        ListNode NewNode=head;
        
        int i=1;
        int j=0;
        while(i<(n-k)){
            ListNode Next=NewNode.next;
            ListNode current=list.get(j);
            current.next=Next;
            NewNode.next=current;
            NewNode=Next;
            i++;
            j++;
        }
        
        if(n%2==0){
            NewNode.next.next=null;
        }
        else{
            NewNode.next=null;
        }
        
        
    }
}