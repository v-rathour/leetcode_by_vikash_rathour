class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int []arr = new int[n];
        
        int j= 0;
        for(String word : words){
            
            int rev = 0;
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                int bit = ch-'a';
                rev |= (1<<bit);
            }
            
            arr[j] = rev;
            j++;
        }
        
        int ans = 0;
        
        for(int i = 0;i<arr.length;i++){
            for(int k = i+1;k<arr.length;k++){
                if((arr[i]&arr[k]) == 0){
                      ans = Math.max(ans,words[i].length()*words[k].length());
                }
            }
        }
        
        
        return ans;
    }
}