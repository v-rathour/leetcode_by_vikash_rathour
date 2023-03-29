class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String str="";
        for(int i=0;i<arr.length;i++){
            str +=reverse(arr[i])+" ";
        }
        
        return str.substring(0,str.length()-1);
    }
     public String reverse(String str){
         String s="";
         int j=str.length()-1;
         while(j>=0){
             char ch=str.charAt(j);
             s +=ch;
             j--;
         }
         
         return s;
     }
    
}