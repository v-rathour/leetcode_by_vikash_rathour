class Solution {
    
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        String codes[]={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0)
            return list;
         printKeypad(digits,"",list, codes);
         return list;
    }
    public static void printKeypad(String str,String ans,List<String> list,String codes[]){
        if(str.length()==0){
            list.add(ans);
            return;
        }
        char ch=str.charAt(0);
        String s=codes[ch-'0'];
        for(int i=0;i<s.length();i++){
             printKeypad(str.substring(1),ans+s.charAt(i),list,codes);
        }
    }
}