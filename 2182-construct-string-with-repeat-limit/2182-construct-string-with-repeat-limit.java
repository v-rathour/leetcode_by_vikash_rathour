class Solution {
    
    class Pair implements Comparable<Pair> {

        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair obj) {
            // Compare based on frequency. Adjust as needed for your requirements.
            return obj.ch - this.ch;
        }
    }

    
    public String repeatLimitedString(String s, int repeatLimit) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        
        for(char c : map.keySet()){
            pq.add(new Pair(c,map.get(c)));
        }
        
        StringBuilder sb = new StringBuilder();
        Pair rem = pq.remove();
        
        while(!pq.isEmpty()){
            Pair newrem = pq.remove();
            int timer = 0;
            int newfreq = 0;
            if(newrem.ch>rem.ch){
                timer = 1;
                newfreq = rem.freq-1;
            }
            else{
                timer = rem.freq>=repeatLimit?repeatLimit:rem.freq;
                newfreq = rem.freq-repeatLimit;
            }
            sb.append(String.valueOf(rem.ch).repeat(timer));
           
            
            
            if(newfreq>0){
               pq.add(new Pair(rem.ch,newfreq));
            }
            
            rem = newrem;
                
        }
        sb.append(String.valueOf(rem.ch).repeat(rem.freq>=repeatLimit?repeatLimit:rem.freq));
        return sb.toString();
        
    }
}