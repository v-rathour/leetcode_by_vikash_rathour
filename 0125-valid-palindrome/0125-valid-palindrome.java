class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                str +=s.charAt(i);
            }
            else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                str +=(char)(s.charAt(i)+32);
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                 str +=s.charAt(i);
            }
        }
        System.out.println(str);
        if(palindrom(str)){
            return true;
        }
        
        return false;
    }
    
    public boolean palindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}