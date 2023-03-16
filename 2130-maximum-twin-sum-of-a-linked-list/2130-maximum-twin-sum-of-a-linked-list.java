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
    public int pairSum(ListNode head) {
     int size = 0;
     ListNode temp = head;
     while(temp != null)
     {
        size++;
        temp = temp.next;
     }
     int[] arr = new int[size];
     temp = head;
     int i = 0;
     while(temp != null)
     {
         arr[i++] = temp.val;
         temp = temp.next;
     }
     int sum = 0;
     i = 0;
     int j = size - 1;
     int max = 0; 
     while(i < j)
     {
        sum = arr[i] + arr[j];
        if(sum > max)
        {
            max = sum;
        }
        i++;
        j--;
        sum = 0;
     }
     return max;
    }
}