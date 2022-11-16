class Solution {
    public String reverseWords(String S) {
       return  reversedList(S);
    }
    public static String reversedList(String str){
        str=str.trim();
        String ans="";
        String arr[]=str.split("\s+");
        for(int i=arr.length-1;i>=0;i--){
           ans=ans+arr[i]+" ";
        }
        return ans.trim();
    }
}