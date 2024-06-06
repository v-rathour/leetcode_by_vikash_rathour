class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
       
        if((hand.length%groupSize != 0)){
            return false;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<hand.length;i++){
            if(!map.containsKey(hand[i])){
                map.put(hand[i],1);
            }
            else{
                map.put(hand[i],map.get(hand[i])+1);
            }
        }
        
        Arrays.sort(hand);
        
        int group = 0;
        for(int i = 0;i<hand.length;i++){
            // System.out.println(map);
            if(map.get(hand[i]) != 0){
                group++;
                int k = groupSize;
                int temp = hand[i];
                
                while(k>0){
                    
                    if(map.containsKey(temp) && map.get(temp) != 0){
                        map.put(temp,map.get(temp)-1);
                        k--;
                        temp++;
                        
                    }
                    else{
                        return false;
                    }
                    
                }
            }
        }
        
        
        
        return true;
        
    }
}