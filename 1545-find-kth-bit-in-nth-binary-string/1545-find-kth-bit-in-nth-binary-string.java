class Solution {
    public char findKthBit(int n, int k) {
        String ans="0";
        int j=1;
        while(j<n){
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < ans.length(); i++) {
                if (ans.charAt(i) == '0') {
                      result.append('1');
                 } else {
                      result.append('0');
                 }
            }
            ans=ans+'1'+result.reverse().toString();
            if(ans.length()>=k){
                break;
            }
            j++;
        }
        
        return ans.charAt(k-1);
    }
}