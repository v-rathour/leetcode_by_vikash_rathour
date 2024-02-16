class Solution {
    
    class Pair implements Comparable<Pair>{
        
        int val;
        int freq;
        
        Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair o) {
            return this.freq-o.freq;
        }
    }
    
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int key : map.keySet()){
            
             pq.add(new Pair(key,map.get(key)));
            
        }
        
        while(!pq.isEmpty()){
            
            Pair rem = pq.remove();
            
            if(rem.freq<=k){
                k -= rem.freq;
            }
            else{
                pq.add(rem);
                break;
            }
            
        }
        
        return pq.size();
        
    }
}