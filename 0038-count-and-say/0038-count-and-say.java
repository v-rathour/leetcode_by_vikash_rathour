class Solution {
    public String countAndSay(int n) {
       String ans="1";
        
        for(int i=1;i<n;i++){
            String s="";
            int fre=0;
            for(int j=0;j<ans.length();j++){
                fre++;
                if(j==ans.length()-1 || ans.charAt(j)!=ans.charAt(j+1)){
                    s +=fre+""+ans.charAt(j);
                    fre=0;
                }
            }
            
            ans=s;
        }
        
        return ans;
    }
}