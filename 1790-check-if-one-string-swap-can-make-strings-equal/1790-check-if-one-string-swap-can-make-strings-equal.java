class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        HashMap<Character,Integer> list=new HashMap<>();
        HashMap<Character,Integer> list1=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char ch1=s2.charAt(i);
            if(list.containsKey(ch)==false){
                list.put(ch,1);
            }
            else{
                list.put(ch,list.get(ch)+1);
            }
            if(list1.containsKey(ch1)==false){
                list1.put(ch1,1);
            }
            else{
                list1.put(ch1,list1.get(ch1)+1);
            }
        }
        for(char ch:list.keySet()){
            if(list.get(ch)!=list1.get(ch)){
                return false;
            }
        }
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