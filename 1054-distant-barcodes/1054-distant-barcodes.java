class Solution {
    
    public class Pair{
        
        int val;
        int freq;
        
        public Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }
        
    }
    
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n = barcodes.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<barcodes.length;i++){
            int key = barcodes[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
            }
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
                  return b.freq-a.freq;
        });
        
        for(int key : map.keySet()){
            
            pq.add(new Pair(key,map.get(key)));
        }
        
        Pair previous = null;
        int i = 0;
        while(i<n){
            
            Pair rem = pq.remove();
            barcodes[i] = rem.val;
            rem.freq--;
            i++;
            
            if(previous != null){
                pq.add(previous);
            }
            
            if(rem.freq>0){
                previous = rem;
            }
            else{
                previous = null;
            }
            
        }
        
        return barcodes;
    }
}