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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Check if both linked list are empty
        if(list1==null && list2==null)
            return null;
        ListNode currentNode=list1;
        
       if(currentNode!=null){
           //reach at the last node of the first link list
                   while(currentNode.next!=null)
                        currentNode=currentNode.next;
           //linked the second link list to the first link list
                   currentNode.next=list2;
       }
        else{
            // when only first lin list empty then second list linked directly to first list
            list1=list2;
        }
        // again intialize 
        currentNode=list1;
         ListNode secondNode=currentNode.next;
        // bubble sort algorithem 
        while(currentNode.next!=null){

            while(secondNode!=null){
                if(currentNode.val>secondNode.val){
                    int temp=currentNode.val;
                    currentNode.val=secondNode.val;
                    secondNode.val=temp;
                }
                secondNode=secondNode.next;
            }
            currentNode=currentNode.next;
            secondNode=currentNode;
        }
        return list1;
    }
}