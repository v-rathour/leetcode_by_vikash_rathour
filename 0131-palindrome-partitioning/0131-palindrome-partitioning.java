class Solution {
    
    public List<List<String>> partition(String s) {
        List<List<String>> answer = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        ValidPartition(s,0,temp,answer);
        return answer;
    }
    
    public void ValidPartition(String s,int i,List<String> temp,List<List<String>> answer){
        
        if(i == s.length()){
            answer.add(new ArrayList(temp));
            return;
        }
        
        for(int j = i;j<s.length();j++){
            String str = s.substring(i,j+1);
            if(isPalindrome(str)){
                
                temp.add(str);
                ValidPartition(s,j+1,temp,answer);
                temp.remove(temp.size()-1);
            }
        }
        
    }
    
    
    public boolean isPalindrome(String str){
        
        int i = 0;
        int j = str.length()-1;
        
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
}