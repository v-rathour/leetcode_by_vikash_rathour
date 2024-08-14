class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int low=0;
        int high=nums[n-1]-nums[0];
        while(low < high){
            int mid=(high+low)/2;
            if(countPairs(nums,mid)<k){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }

    private int countPairs(int[] nums, int mid){
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            while (j < nums.length && nums[j] - nums[i] <= mid) {
                j++;
            }
            count += j - i - 1;
        }
        return count;
    }
}