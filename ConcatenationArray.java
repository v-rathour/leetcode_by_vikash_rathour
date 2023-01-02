class ConcatenationArray {
    public int[] getConcatenation(int[] nums) {
        int k=0;
        int j=nums.length;
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            ans[j]=nums[i];
            k++;
            j++;
        }
        return ans;
    }
}
