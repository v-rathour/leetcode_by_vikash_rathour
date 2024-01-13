class Solution {
    public int minimumSwap(String s1, String s2) {
        
        int x = 0;
        int y = 0;
        for(int i = 0;i<s2.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 == 'x') x++ ; else y++;
            if(ch2 == 'x') x++; else y++;
            
        }
        
        if(x%2 != 0 || y%2 != 0){
            return -1;
        }
        
        int X = 0;
        int Y = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(s1.charAt(i) == 'x') X++; else Y++;
            }
        }
        
        int ans = 0;
        ans += X/2;
        X %= 2;
        ans += Y/2;
        Y %= 2;
        
        if(X != 0 || Y != 0){
            ans += 2;
        }
        
        return ans;
        
    }
}