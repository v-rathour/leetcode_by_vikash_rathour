class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            
            int num = arr[i]%k;
            
            if(num <0){
                num += k;
            }
            
            if(!map.containsKey(num)){
                map.put(num , 0);
            }
            
            map.put(num,map.get(num)+1);
            
            
        }
        
        boolean []visited = new boolean[k];
      
        for(int key : map.keySet()){
            if(key == 0){
                
                if(map.get(key)%2 != 0){
                   
                    return false;
                     
                }
                visited[key] = true;
            }
            else if(!visited[key]){
                if(!map.containsKey(k-key) || !map.get(key).equals(map.get(k - key))){
                    
                    return false;
                }
                
                visited[key] = true;
                visited[k-key] = true;
            }
        }
        
        return true;
    }
}