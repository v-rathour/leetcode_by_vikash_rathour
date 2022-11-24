class Solution {
    public String minWindow(String s, String t) {
        
        return MimimumWnidow(s,t);
        
    }
   public static String MimimumWnidow(String s,String t){
        int []frqt=new int[123];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            frqt[ch]++;
        }
        int[] frqs=new int[123];
        int si=0;
        int ei=0;
        int start=-1;
        int len=Integer.MAX_VALUE;
        int count=0;
        while(ei<s.length()){
            // grow
            char ch=s.charAt(ei);
            frqs[ch]++;
            if(frqt[ch] >= frqs[ch]){
                count++;
            }
            // shrink
            if(count==t.length()){

                while(frqs[s.charAt(si)]> frqt[s.charAt(si)] && si<=ei){
                    frqs[s.charAt(si)]--;
                    si++;
                }
                // ans
                if(len>ei-si+1){
                    len=ei-si+1;
                    start=si;
                }
            }

            ei++;
        }
        if(start==-1)
            return "";
        return s.substring(start,start+len);
    }
}