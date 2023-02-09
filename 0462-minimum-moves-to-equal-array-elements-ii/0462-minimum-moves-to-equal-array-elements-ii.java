class Solution {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums);
     int mid=nums.length/2;
     int l_sum=0;
     int r_sum=0;
     int i=0;

     while(i<mid){
           l_sum +=nums[mid]-nums[i];
           i++;
     }   

     int j=mid+1;
     while(j<nums.length){
          r_sum +=nums[j]-nums[mid];
          j++;
     }
     
     return l_sum+r_sum;
    }
}