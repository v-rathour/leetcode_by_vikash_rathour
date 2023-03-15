class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] mamo = new int[s.length()];
        return wordBreak (s,wordDict,mamo);
    }

    public boolean wordBreak(String s, List<String> wordDict,int[] mamo) {
        if (s.length()==0) 
            return true;
        for (int i=s.length()-1; i>=0;i--){
            if (wordsContain(wordDict,s.substring(i))){
                if (mamo[i]==-1) 
                      continue;
                else if(wordBreak (s.substring(0,i),wordDict,mamo)) 
                    return true;
                else 
                    mamo[i]=-1;
            }
        }
        return false;
    }

    public boolean wordsContain (List<String> wordDict,String s){
        for (String word:wordDict){
            if (word.equals(s)) 
                return true;
        }
        return false;
    }
}