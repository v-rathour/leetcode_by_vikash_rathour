class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int k=0;
        Arrays.sort(nums);
        while(k<=n){
            int flag=0;
            int i=0;
            int j=nums.length-1;
            while(i<=j){
                int mid=(i+j)/2;
                if(k==nums[mid]){
                     flag=1;
                    break;
                }
                if(k>nums[mid])
                    i=mid+1;
                if(k<nums[mid])
                    j=mid-1;
            }
            if(flag==0)
                break;
            k++;
        }
        return k;
        
    }
}