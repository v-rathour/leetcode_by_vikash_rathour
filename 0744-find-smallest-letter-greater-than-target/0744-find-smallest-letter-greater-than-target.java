class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        // if(letters[0]<target || target=='z'){
        //     return letters[0];
        // }
        
        int j=0;
        while(j<letters.length){
            
            if(letters[j]>target){
                return letters[j];
               
            }
            j++;
        }
        
        return letters[0];
    }
}