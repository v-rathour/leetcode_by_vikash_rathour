class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        HashMap<Character,Integer> list=new HashMap<>();
        HashMap<Character,Integer> list1=new HashMap<>();
        // Add the character in the HashMap
        for(int i=0;i<s1.length();i++){
            
            char ch=s1.charAt(i);
            char ch1=s2.charAt(i);
            // Add the character of string s1 with frequency in hashmap list
            if(list.containsKey(ch)==false){
                list.put(ch,1);
            }
            else{
                list.put(ch,list.get(ch)+1);
            }
            // Add the character of string s2 with frequency in hashmap list1
            if(list1.containsKey(ch1)==false){
                list1.put(ch1,1);
            }
            else{
                list1.put(ch1,list1.get(ch1)+1);
            }
            
        }
        //check the frequency in both HashMap
        for(char ch:list.keySet()){
            // if frequency in both HashMap are not equal 
            if(list.get(ch)!=list1.get(ch)){
                return false;
            }
        }
        // count the number of mismatch character index in string s1 from s2
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
        
    }
}