class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        } 
        for(int i=0;i<queries.length;i++){
            int n=Length_sebsequence(sum,queries[i],nums);
            queries[i]=n;
        }
        return queries;
    }
    public static int Length_sebsequence(int sum,int num,int nums[]){
         for(int i=nums.length-1;i>=0;i--){
             if(sum<=num)
               return i+1;
            sum -=nums[i];
         }
         return 0;
    }
}
