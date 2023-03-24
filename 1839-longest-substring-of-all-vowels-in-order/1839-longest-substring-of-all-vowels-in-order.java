class Solution {
    public int longestBeautifulSubstring(String word) {
        return Longest_Substring(word);
    }
    public int Longest_Substring(String str){
        int si=0;
        int ei=0;
        int count=0;
        int ans=0;
        while(ei<str.length()){
            char ch=str.charAt(ei);
            if(ei==0){
                count++;
            }
            else if( str.charAt(ei-1)<=ch){
                if(str.charAt(ei-1)!=ch)
                    count++;
            }
            else{
                if (count==5){
                    ans=Math.max(ans,(ei-si));
                }

                count=1;
                si=ei;
            }
            
            if(ei==str.length()-1 && count==5){
                ans=Math.max(ans,(ei-si+1));
            }
            ei++;
        }
        return ans;
    }
}