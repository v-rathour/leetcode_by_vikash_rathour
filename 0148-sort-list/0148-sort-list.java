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
    public ListNode sortList(ListNode head) {
        ListNode currentNode=head;
        int count=0;
        while(currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }
        int arr[]=new int[count];
        currentNode=head;
        int i=0;
        while(currentNode!=null){
            arr[i]=currentNode.val;
            i++;
            currentNode=currentNode.next;
        }
        Arrays.sort(arr);
        currentNode=head;
        for(int j=0;j<arr.length;j++){
            currentNode.val=arr[j];
            currentNode=currentNode.next;
        }
        return head;
    }
}