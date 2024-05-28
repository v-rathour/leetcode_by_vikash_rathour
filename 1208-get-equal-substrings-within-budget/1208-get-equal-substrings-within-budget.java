class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int ans = -1;
        int window = 0;
        int i = 0;
        int j = 0;
        
        while(j<s.length()){
            window += Math.abs(s.charAt(j)-t.charAt(j));
            while(window>maxCost){
                window -= Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            ans = Math.max(ans,j-i+1);
            
            j++;
            
        }
        
        return ans;
        
    }
    
  
}