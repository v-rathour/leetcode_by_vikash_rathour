class Subarray_Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0;
        for(int num: nums){
            arr[i]= num;
            i++;
        }
        Arrays.sort(arr);
        int j=nums.length-1;
        for(i=0;i<nums.length && i<=j;i++ ){
                if(arr[i]!=nums[i])
                   break;
        }
        
        for(;j>=0 && j>=i;j--){
             if(arr[j]!=nums[j])
               break;
        }
        return j-i+1;
    }
}
