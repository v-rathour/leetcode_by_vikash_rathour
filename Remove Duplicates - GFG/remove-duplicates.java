//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
          int arr[]=new int[26];
          for(int i=0;i<S.length();i++){
              arr[S.charAt(i)-'a']++;
          }
          String str="";
          for(int i=0;i<S.length();i++){
              if(arr[S.charAt(i)-'a']>=1){
                  str +=S.charAt(i);
                  arr[S.charAt(i)-'a']=0;
              }
          }
          return str;
    }
}