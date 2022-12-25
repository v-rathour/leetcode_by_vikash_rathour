//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr = new int[n][m];
            
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    arr[i][j] = sc.nextInt ();

    		System.out.println (new Sol().maxOnes (arr, n, m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int ans=0;
        int row=0;
        for(int i=0;i<N;i++){
            int num=One_count(Mat[i]);
            if(ans<num){
                ans=num;
                row=i;
            }
        }
        return row;
    }
    public static int One_count(int arr[]){
        int count=0;
        for(int num:arr){
            if(num==1)
               count++;
        }
        return count;
    }
}