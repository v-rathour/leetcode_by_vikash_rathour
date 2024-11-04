class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        
        char prefix=word.charAt(0);
        int len=0;        
        for(char chr:word.toCharArray()){
            if(chr==prefix && len<9){
                len++;
            }
            else{
                sb.append(len).append(prefix);
                len=1;
                prefix=chr;
            }
        }    
        sb.append(len).append(prefix);        
        
        return sb.toString();
    }
}