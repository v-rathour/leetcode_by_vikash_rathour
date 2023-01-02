class Capital_Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()<=1){
            return true;
        }
        if(isUpperCase(word))
            return true;
        if(isLowerCase(word))
            return true;
        if(isCapatalize(word))
            return true;
        return false;
    }
    public static boolean isUpperCase(String str){
        int i=0;
        while(i<str.length()){
            if((str.charAt(i)>=65 && str.charAt(i)<=90)==false)
                   return false;
            i++;
        }
         return true;
    }
    public static boolean isLowerCase(String str){
        int i=0;
        while(i<str.length()){
            if((str.charAt(i)>=97 && str.charAt(i)<=122)==false)
                    return false;
            i++;
        }
        return true;
    }
    public static boolean isCapatalize(String str){
        if((str.charAt(0)>=65 && str.charAt(0)<=90)==false)
              return false;
        int i=1;
        while(i<str.length()){
            if((str.charAt(i)>=97 && str.charAt(i)<=122)==false)
                    return false;
            i++;
        }
        return true;

    }
}
