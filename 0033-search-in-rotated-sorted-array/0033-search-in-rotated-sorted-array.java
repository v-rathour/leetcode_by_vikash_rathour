class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        for(;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                 break;
        }
        int n=BinarySearch(nums,0,i,target);
        if(n!=-1)
               return n;
        int m=BinarySearch(nums,i+1,nums.length-1,target);
        if(m!=-1)
            return m;
        return -1;
        
    }
    public static int BinarySearch(int nums[],int start,int last,int target){
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
               start=mid+1;
            if(nums[mid]>target)
                last=mid-1;
        }
        return -1;
    }
}