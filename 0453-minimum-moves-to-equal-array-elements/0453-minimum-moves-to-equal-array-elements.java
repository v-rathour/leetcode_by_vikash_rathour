class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
              sum +=Math.abs(nums[0]-nums[i]);
        }
        return sum;
    }
      
}