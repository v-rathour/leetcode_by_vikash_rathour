class Solution {
    public int lengthOfLongestSubstring(String s) {
        return NonRepeatedString(s);
    }
    public static int NonRepeatedString(String str){
           int si=0;
           int ei=0;
           int ans=0;
           int arr[]=new int[256];
           while(ei<str.length()){
              
                if(arr[str.charAt(ei)]==0)
                {
                    arr[str.charAt(ei)]++;
                    ans=Math.max(ans,ei-si+1);
                    ei++;
                }
                else
                {
                    arr[str.charAt(si)]--;
                    si++;
                }
           }
           return ans;
    }
}