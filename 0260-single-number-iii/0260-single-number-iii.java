class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xorele = 0;
        
        for(int i = 0;i<nums.length;i++){
            xorele ^= nums[i];
        }
        
        int rmsb = xorele & -xorele;
        
        int x = 0;
        int y = 0;
        
        for(int num : nums){
            if((num&rmsb) == 0){
                x ^= num;
            }
            else{
                y ^= num;
            }
        }
        
        int []a = new int[2];
        a[0] = x;
        a[1] = y;
        
        return a;
        
    }
}