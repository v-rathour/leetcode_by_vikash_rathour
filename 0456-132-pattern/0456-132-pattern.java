class Solution {
    public boolean find132pattern(int[] nums) {
       Stack<Integer> st=new Stack<>();
        int thirdelement=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<thirdelement){
                return true;
            }
            while(!st.isEmpty() && st.peek()<nums[i]){
                thirdelement=st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}