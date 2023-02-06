class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=n;
        int k=0;
        int arr[]=new int[2*n];
       for(int i=0;i<n;i++,j++){
           arr[k++]=nums[i];
           arr[k++]=nums[j];
       } 
       return arr;
    }
}