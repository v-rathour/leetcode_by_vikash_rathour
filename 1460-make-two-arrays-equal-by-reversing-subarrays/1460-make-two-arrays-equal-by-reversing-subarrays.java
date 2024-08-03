class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
            
            map.put(arr[i],map.get(arr[i])+1);
        }
        
        for(int i = 0;i<target.length;i++){
            
            if(!map.containsKey(target[i])){
                return false;
            }
            
            map.put(target[i],map.get(target[i])-1);
            
            if(map.get(target[i]) == 0){
                map.remove(target[i]);
            }
        }
        
        return true;
        
    }
}