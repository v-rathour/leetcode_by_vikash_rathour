class findMax_Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int i=0;
        while(i<k){
            sum +=nums[i];
            i++;
        }
        int ans=sum;
        i=0;
        int j=k;
        while(j<nums.length){
            sum=sum-nums[i]+nums[j];
            ans=Math.max(sum,ans);
            i++;
            j++;
        }
        return ((double)ans)/((double)k);
    }  
}
