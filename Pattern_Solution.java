class Pattern_Solution {
     public static boolean wordPattern(String pattern, String s) {
       HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
       HashMap<String,ArrayList<Integer>> map1=new HashMap<>();
    
       String arr[]=s.split(" ");

       if(arr.length!=pattern.length())
           return false;

       for(int i=0;i<pattern.length();i++){
           if(map.containsKey(pattern.charAt(i))==false){
               ArrayList<Integer> list=new ArrayList<>();
               list.add(i);
               map.put(pattern.charAt(i),list);
           }
           else{
               ArrayList<Integer> l1=map.get(pattern.charAt(i));
               l1.add(i);
               map.put(pattern.charAt(i),l1);
           }
       }
       
       for(int i=0;i<arr.length;i++){
           if(map1.containsKey(arr[i])==false){
               ArrayList<Integer> list=new ArrayList<>();
               list.add(i);
               map1.put(arr[i],list);
           }
           else{
               ArrayList<Integer> l1=map1.get(arr[i]);
               l1.add(i);
               map1.put(arr[i],l1);
           }
       }
       if(map.size()!=map1.size())
          return false;
       
       for(char ch:map.keySet()){

            ArrayList<Integer> set=map.get(ch);
            String str=arr[set.get(0)];
            if(set.get(0)!=0 && str.equals(arr[set.get(0)-1])==true)
                  return false;
            for(int num:set){
                if(str.equals(arr[num])==false)
                  return false;
            }
       }
       return true;
    }
}
