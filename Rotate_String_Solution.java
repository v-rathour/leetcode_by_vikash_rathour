class Rotate_String_Solution {
    public boolean rotateString(String s, String goal) {
        
        for(int i=0;i<s.length();i++){
            
            String str="";
          
            String str1=s.substring(0,i+1);
          
            String str2=s.substring(i+1,s.length());
          
            str=str2+str1;
          
            if(str.equals(goal))
               return true;
        }
        return false;
    }
}
