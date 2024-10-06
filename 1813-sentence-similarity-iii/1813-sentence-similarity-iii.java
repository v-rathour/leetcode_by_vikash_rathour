class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
         String []s1 = sentence1.split(" ");
         String []s2 = sentence2.split(" ");
        
        boolean answer = false;
        if(s1.length<=s2.length){
            answer = checkSentance(s1,s2);
        }else{
            answer = checkSentance(s2,s1);
        }
        
        
        return answer;
    }
    
    public boolean checkSentance(String s1[],String []s2){
        
        int i = 0;
        
        for(i = 0;i<s1.length;i++){
            if(!s1[i].equals(s2[i])){
                break;
            }
        }
        
        int j = 0;
        int k = s2.length-1;
        for(j = s1.length-1;j>=i;j--,k--){
            if(!s1[j].equals(s2[k])){
                // System.out.println(s1[j]+" "+s2[k]);
                return false;
            }
        }
        
        return true;
        
    }
}