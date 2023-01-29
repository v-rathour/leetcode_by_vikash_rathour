//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    int array1[];
    int tempMargeArray[];
    int length;
    public  void sort012(int a[], int n)
    {
        // code here 
        Short(a);
    }
    public void margeArray(int LowerIndex,int middle,int HigherIndex)
    {
        for(int i=LowerIndex;i<=HigherIndex;i++)
        {
            tempMargeArray[i]=array1[i];
        }
        int i=LowerIndex;
        int j=middle+1;
        int k=LowerIndex;
        while(i<=middle&&j<=HigherIndex)
        {
            if(tempMargeArray[i]<=tempMargeArray[j])
            {
                array1[k]= tempMargeArray[i];
                i++;
            }
            else {
                array1[k]=tempMargeArray[j];
                j++;
            }k++;
        }
        while (i<=middle)
        {
            array1[k]=tempMargeArray[i];
            k++;
            i++;
        }
    }
    public void DivideMethod(int LowerIndex,int HigherIndex)
    {
       if(LowerIndex<HigherIndex)
       {
           int middle=LowerIndex+(HigherIndex-LowerIndex)/2;
           DivideMethod(LowerIndex,middle);
           DivideMethod(middle+1,HigherIndex);
           margeArray(LowerIndex,middle,HigherIndex);
       }

    }
    public void Short(int IndexArray[])
    {
        this.array1=IndexArray;
        this.length=array1.length;
        this.tempMargeArray=new int[length];
        DivideMethod(0,length-1);
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends