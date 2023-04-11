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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode=l1;
        ListNode previous=null;
        
        while(currentNode!=null){
            ListNode Next=currentNode.next;
            currentNode.next=previous;
            previous=currentNode;
            currentNode=Next;
        }
        l1=previous;
        
        ListNode current=l2;
        ListNode pre=null;
        
        while(current!=null){
            ListNode Next=current.next;
            current.next=pre;
            pre=current;
            current=Next;
        }
        
        l2=pre;
       
        ListNode NewNode=new ListNode(-1);
        ListNode result=NewNode;
        
        ListNode list1=l1;
        ListNode list2=l2;
        
        int carry=0;
        while(list1!=null && list2!=null){
            int val1=list1.val;
            int val2=list2.val;
            
            int sum=val1+val2+carry;
            ListNode n=new ListNode(sum%10);
            result.next=n;
            result=n;
            sum /=10;
            carry=sum%10;
            
            list1=list1.next;
            list2=list2.next;
            
        }
        
        while(list1!=null){
            int val1=list1.val;
            
            int sum=val1+carry;
            ListNode n=new ListNode(sum%10);
            result.next=n;
            result=n;
            sum /=10;
            carry=sum%10;
            
            list1=list1.next;
        }
        
        while(list2!=null){
            int val2=list2.val;
            
            int sum=val2+carry;
            ListNode n=new ListNode(sum%10);
            result.next=n;
            result=n;
            sum /=10;
            carry=sum%10;
            
            list2=list2.next;
        }
        
        if(carry!=0){
            ListNode n=new ListNode(carry);
            result.next=n;
            result=n;
            
        }
        ListNode list=null;
        ListNode cuur=NewNode.next;
        while(cuur!=null){
            ListNode Next=cuur.next;
            cuur.next=list;
            list=cuur;
            cuur=Next;
        }
        NewNode=list;
        return NewNode;
    }
    
}