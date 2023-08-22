class Solution {
    public String convertToTitle(int columnNumber) {
        
        String ans = "";
        
        while(columnNumber!=0){
                
                char ch = (char)((int)'A'+((columnNumber-1)%26));

                ans = ch+ans;

                columnNumber = (columnNumber-1)/26;
           
        }
        
        
        return ans;
    }
}