class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        for(int i = 0,j = 2;i<nums.length;i+=3,j+=3){
            if((nums[j]-nums[i]) >  k){
                return new int[0][0];
            }
        }
        
        int [][] arr = new int[nums.length/3][3];
        
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(i%3 == 0 && i != 0){
                j++;
            }
            arr[j][i%3] = nums[i];
        }
        
        return arr;
        
    }
    
    
}