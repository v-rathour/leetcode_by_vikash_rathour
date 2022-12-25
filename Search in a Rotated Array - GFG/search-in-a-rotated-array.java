//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int i=0;
        for(;i<A.length-1;i++){
            if(A[i]>A[i+1])
              break;
        }
        int n=BinarySearch(A,0,i,key);
        if(n!=-1)
            return n;
        int m=BinarySearch(A,i+1,A.length-1,key);
        if(m!=-1)
            return m;
        return -1;
    }
    public static int BinarySearch(int arr[],int start,int last,int target){
        while(start<=last){
            int mid=start+(last-start)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
                start=mid+1;
            if(arr[mid]>target)
               last=mid-1;
        }
        return -1;
    }
}