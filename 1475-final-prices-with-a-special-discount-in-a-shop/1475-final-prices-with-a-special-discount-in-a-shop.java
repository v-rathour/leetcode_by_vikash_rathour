class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length;
        st.push(n-1);
        
        int answer[] = new int[n];
        answer[n-1] = prices[n-1];
            
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty()){
                if(prices[i]>=prices[st.peek()]){
                    break;
                }
                else{
                    st.pop();
                }
            }
            
            if(!st.isEmpty()){
                answer[i] = prices[i]-prices[st.peek()];
            }
            else{
                answer[i] = prices[i];
            }
            
            st.push(i);
        }
        
        return answer;
    }
}