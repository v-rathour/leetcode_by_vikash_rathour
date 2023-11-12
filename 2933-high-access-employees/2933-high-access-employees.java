class Solution {
    
    
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        
        HashMap<String,List<Integer>> map = new HashMap<>();
        
        for(List<String> list :access_times){
             String s = list.get(0);
             int temp = Integer.parseInt(list.get(1));
            
            if(!map.containsKey(s)){
                List<Integer> ll = new ArrayList<>();
                ll.add(temp);
                map.put(s,ll);
            }
            else{
                map.get(s).add(temp);
            }
        }
        
        List<String> ans = new ArrayList<>();
        
        for(String s : map.keySet()){
            
            List<Integer> ll = map.get(s);
            if(ll.size() >= 3){
                
                Collections.sort(ll);
                
                for(int j = 0;j<ll.size()-2;j++){
                    if(ll.get(j+2)-ll.get(j)<=99 && !ans.contains(s)){
                       ans.add(s);
                        continue;
                    }
                    
                }
            }
            
            
        }
        
        
        
        return ans;
        
        
        
    }
}