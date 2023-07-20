class Solution {
    public class Pair implements Comparable<Pair>{
        int val;
        int indx;
        
        public Pair(int val,int indx){
            this.val = val;
            this.indx = indx;
        }
        
        public int compareTo(Pair obj){
            return obj.val - this.val;
        }
    }
    
    String ranks[] = {"Gold Medal","Silver Medal","Bronze Medal"};
    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        String answer[] = new String[score.length];
        for(int i =0;i<score.length;i++){
            pq.add(new Pair(score[i],i));
        }
        
        int i=0;
        while(!pq.isEmpty()){
            
            i++;
            Pair rem = pq.remove();
            
            if(i<=3){
                answer[rem.indx] = ranks[i-1];
            }
            else{
                answer[rem.indx] = i+"";
            }
            
        }
        
        return answer;
        
        
    }
}