class Solution {
    public int minimumPushes(String word) {
        
        int []freq = new int[26];
        
        for(int i = 0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        
        Arrays.sort(freq);
        int maxkey = 0;
        int push = 1;
        int ans = 0;
        
        for(int i = freq.length-1;i>=0 && freq[i] != 0;i--){
            maxkey++;
            
            ans += freq[i]*push;
            
            if(maxkey == 8){
                maxkey = 0;
                push++;
            }
        }
        
        return ans;
    }
}