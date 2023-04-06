class Solution {
    public int countSegments(String s) {
        String str[]=s.split(" ");
        int count=0;
       for(String val:str){
            if(val.length()>0){
               count++;
            }
       }
        
       return count;
    }
}