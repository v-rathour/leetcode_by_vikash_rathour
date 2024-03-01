class Solution {
    
    public String maximumOddBinaryNumber(String s) {
        
        int n = s.length();
        int count = 0;
        for(int i = 0;i<n;i++){
             if(s.charAt(i) == '1'){
                 count++;
             }
        }
        String ans = "";
        int i = 0;
        while(i<count-1){
            ans += '1';
            i++;
        }
        
        while(i<n-1){
            ans += '0';
            i++;
        }
        
        ans += '1';
        
        return ans;
    }
}