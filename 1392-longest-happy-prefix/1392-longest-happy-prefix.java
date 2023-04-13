class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        
        int []lps=new int [n];
        
        int j=0;
        for(int i=1;i<n;i++){
            
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                
                j=lps[j-1];
            }
            
            if(s.charAt(i)==s.charAt(j)){
                
                j++;
            }
            
            lps[i]=j;
        }
        return s.substring(0,lps[n-1]);
        
    }
}