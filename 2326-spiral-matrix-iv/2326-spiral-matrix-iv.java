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
    public int[][] spiralMatrix(int m, int n, ListNode head) {  
        int arr[][] = new int[m][n];  
        
        // Initialize the array with -1  
        for (int i = 0; i < m; i++) {  
            Arrays.fill(arr[i], -1);  
        }  

        ListNode currentNode = head;  
        int minr = 0;  
        int maxr = m - 1;  
        int minc = 0;  
        int maxc = n - 1;  

        int total = m * n;  
        int count = 0;  

        while (count < total) {  
            // Fill top row  
            for (int i = minc; i <= maxc && count < total; i++) {  
                if (currentNode != null) {  
                    arr[minr][i] = currentNode.val;  
                    currentNode = currentNode.next;  
                }  
                count++;  
            }  
            minr++;  

            // Fill right column  
            for (int i = minr; i <= maxr && count < total; i++) {  
                if (currentNode != null) {  
                    arr[i][maxc] = currentNode.val;  
                    currentNode = currentNode.next;  
                }  
                count++;  
            }  
            maxc--;  

            // Fill bottom row  
            for (int i = maxc; i >= minc && count < total; i--) {  
                if (currentNode != null) {  
                    arr[maxr][i] = currentNode.val;  
                    currentNode = currentNode.next;  
                }  
                count++;  
            }  
            maxr--;  

            // Fill left column  
            for (int i = maxr; i >= minr && count < total; i--) {  
                if (currentNode != null) {  
                    arr[i][minc] = currentNode.val;  
                    currentNode = currentNode.next;  
                }  
                count++;  
            }  
            minc++;  
        }  

        return arr;  
    }  
}