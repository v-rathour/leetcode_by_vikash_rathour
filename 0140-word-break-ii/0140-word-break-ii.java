class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list=new ArrayList<>();
        word_check(s,wordDict,"",list);
        return list;
    }
    public static void word_check(String s,List<String> wordDict,String ans,List<String> list){
        if(s.length()==0){
            list.add(ans.substring(0,ans.length()-1));
            return;
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i+1);
            if(wordDict.contains(left)){
                String right=s.substring(i+1);
                word_check(right,wordDict,ans+left+" ",list);
            }
        }
    }
}