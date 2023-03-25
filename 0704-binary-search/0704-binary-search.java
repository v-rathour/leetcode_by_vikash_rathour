class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        int first=0;
        int last=nums.length-1;
        
        while(first<=last){
            
            int mid=first+(last-first)/2;
            
            if(nums[mid]==target){
                ans=mid;
                break;
            }
            if(nums[mid]>target){
                last=mid-1;
            }
            if(nums[mid]<target){
                first=mid+1;
            }
        }
        
        return ans;
    }
    
}