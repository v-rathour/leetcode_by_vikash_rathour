class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        List<String> list = new ArrayList<>();
        findString(nums.length,"",set,list);
        return list.get(0);
    }
    
    public void findString(int n,String s,HashSet<String> set,List<String> list){
        
        if(n == 0){
            if(!set.contains(s)){
                list.add(s);
            }
            
            return;
        }

        if(list.size()>=1){
            return;
        }
        
        findString(n-1,s+'0',set,list);
        findString(n-1,s+'1',set,list);
    }
}