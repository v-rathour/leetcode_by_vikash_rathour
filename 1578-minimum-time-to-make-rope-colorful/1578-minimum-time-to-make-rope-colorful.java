class Solution {
    
    public int minCost(String colors, int[] neededTime) {
        
        Stack<Character> st = new Stack<>();
        
        int count = 0;
        int ans = 0;
        int sum = 0;
        int max = 0;
        
        for(int i = 0;i<colors.length();i++){
            char ch = colors.charAt(i);
            if(st.size() == 0 || st.peek() != ch){
                
                st.push(ch);
                ans += sum - max;
                
                count = 0;
                sum = 0;
                max = 0;
                
                sum += neededTime[i];
                max = Math.max(neededTime[i],max);
                count++;
            }
            else{
                count++;
                sum += neededTime[i];
                max = Math.max(neededTime[i],max);
            }
        }
        
        if(count>=2){
            ans += sum-max;
        }
        
        return ans;
        
    }
}