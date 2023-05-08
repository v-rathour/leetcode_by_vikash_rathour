//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[] arr,int n,int s)
    {
        //Your code here
        int sum =0;
        int min=Integer.MIN_VALUE;
        for(int i =0;i< n ;i++){
            sum+=arr[i];
            if(arr[i]<min)
            min =arr[i];
        }
            int low=min;
            int high=sum;
            int ans =-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(ItisPossible(arr,s,mid)){
                    ans =mid;
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            return ans;
    }
    public static boolean ItisPossible(int []arr , int s ,int target){
        int student =1;
        int pages=0;
        if(arr.length<s) return false;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]>target) return false ;
            if(pages+arr[i]>target) {
                student++;
                pages=0;
                pages+=arr[i];
            }
            else {
                pages+=arr[i];
            }
            if(student>s) return false ;
        }
        return true;
        
        
    }
};