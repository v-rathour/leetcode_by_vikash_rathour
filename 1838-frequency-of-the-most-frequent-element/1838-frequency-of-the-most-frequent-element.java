class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int i=0, j=0;
        int max = 0, len = 0;
        long sum = 0;
// System.out.println(nums.length);
        while(j<n){
            sum += nums[j];
            long req = ((long)nums[j] * (j-i+1));

            if(sum+k>=req){
                j++;
                len++;
                max = Math.max(max,len);
            } else {
                sum -= nums[i];
                i++;
                j++;
            }
        }

        return max;
    }
}