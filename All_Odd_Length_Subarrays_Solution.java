class All_Odd_Length_Subarrays_Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
           if((i+1)%2!=0)
             ans +=SumSubarray(arr,i+1);
        }
        return ans;
    }
    public static int SumSubarray(int nums[],int k){
        int ei=0;
        int si=0;
        int ans=0;
        int sum=0;
        while(ei<nums.length){
            sum +=nums[ei];
            if((ei-si+1)==k){
                ans +=sum;
                sum -=nums[si];
                si++;
            }
            ei++;
        }
        return ans;
    }
}
