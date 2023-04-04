class Solution {
    public List<String> letterCasePermutation(String str) {
        str=str.toLowerCase();
        List<String> list=new ArrayList<>();
        permutation(str,"",list);
        return list;        
    }
    public  void permutation(String str,String ans,List<String> list){
        if(str.length()==0){
            list.add(ans);
            return;
        }

        char ch=str.charAt(0);
        if(ch>=97 && ch<=122){
            permutation(str.substring(1),ans+ch,list);
            ch=(char)(ch-32);
            permutation(str.substring(1),ans+ch,list);
        }
        else{
            permutation(str.substring(1),ans+ch,list);
        }
    }
}