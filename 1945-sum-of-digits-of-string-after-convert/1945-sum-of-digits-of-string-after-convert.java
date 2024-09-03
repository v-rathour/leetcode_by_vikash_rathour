class Solution {
    public int getLucky(String s, int k) {
        
        String num = "";
        for(int i = 0;i<s.length();i++){
            int n = (s.charAt(i)-'a')+1;
            num += n;
        }
        
        
        
        for(int i = 0;i<k;i++){
            long sum = 0;
            
            for(int j = 0;j<num.length();j++){
                sum += Long.parseLong(num.charAt(j)+"");
            }
            num = sum+"";
        }
        
        return Integer.parseInt(num); 
    }
}