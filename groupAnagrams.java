class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return AnagramList(strs);
    }
    public static List<List<String>> AnagramList(String str[]){
       HashMap<HashMap<Character,Integer>,List<String>> fmap=new HashMap<>();
       for(String s:str){
           HashMap<Character,Integer> map=new HashMap<>();
           for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
               map.put(ch,map.getOrDefault(ch,0)+1);
           }
           if(fmap.containsKey(map)==false){
               List<String> list=new ArrayList<>();
               list.add(s);
               fmap.put(map,list);
           }
           else{
                List<String> list=fmap.get(map);
                list.add(s);
           }
       }
       List<List<String>> list=new ArrayList<>();
       for(List<String> val:fmap.values()){
           list.add(val);
       }
       return list;
    }
}
