class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            String str=s.substring(i,i+3);
            char ch1=str.charAt(0);
            char ch2=str.charAt(1);
            char ch3=str.charAt(2);
            if(ch1!=ch2 && ch1!=ch3 && ch2!=ch3){
                count++;
            }
        }
        
        return count;
    }
}