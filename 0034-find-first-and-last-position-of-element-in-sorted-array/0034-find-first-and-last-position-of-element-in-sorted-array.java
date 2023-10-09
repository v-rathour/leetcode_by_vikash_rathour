class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int[] arr={-1,-1};
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==target){
                 arr[0]=i;
                 break;
            }
            else
                arr[0]=-1;
            i++;
        }
        while(i<=j){
            if(nums[j]==target){
                arr[1]=j;
                break;
            }
            else
                arr[1]=-1;
            j--;
        }
        return arr;
    }
}