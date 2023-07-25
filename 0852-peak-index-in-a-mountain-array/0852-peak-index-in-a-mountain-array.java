class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int i = 0;
        int j = arr.length-1;
        
        int idx = -1;
        
        while(i<=j){
            
            int mid = i+(j-i)/2;
            
            if(arr[mid-1]<=arr[mid] && arr[mid]>=arr[mid+1]){
                idx = mid;
                break;
            }
            
            if(arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1]){
                i = mid;
            } 
            
            if(arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1]){
                j = mid;
            }
        }
        
        return idx;
    }
}