class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rigth=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            rigth +=nums[i];
        }
        int answer[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            rigth -=nums[i];
            answer[i]=(int)Math.abs(left-rigth);
            left +=nums[i];
            
        }
        
        return answer;
    }
}