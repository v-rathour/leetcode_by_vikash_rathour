class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return Possible_sequence(nums,0,target,0);

    }
    public static int Possible_sequence(int arr[],int row,int target,int sum){
        if(row==arr.length){
            if(target==sum){
                return 1;
            }
            return 0;
        }
        int num=arr[row];
        int a=Possible_sequence(arr,row+1,target,sum+-num);
        int b=Possible_sequence(arr,row+1,target,sum+num);
        return a+b;
    }
}