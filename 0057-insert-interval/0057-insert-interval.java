class Solution {
    
    class Pair implements Comparable<Pair>{
        
        int start;
        int end;
        
        Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
        
        public int compareTo(Pair obj){
            return this.start-obj.start;
        }
        
    }
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int []a : intervals){
            
            int s = a[0];
            int e = a[1];
            
            pq.add(new Pair(s,e));
            
        }
        
        pq.add(new Pair(newInterval[0],newInterval[1]));
        
        while(pq.size()>=2){
             Pair rem1 = pq.remove();
             Pair rem2 = pq.remove();
             // System.out.println(rem1.start+" "+rem1.end);
             if(rem1.end>=rem2.start){
                 pq.add(new Pair(rem1.start,Math.max(rem1.end,rem2.end)));
             }
            else{
                
                answer.add(new ArrayList<>(List.of(rem1.start,rem1.end)));
                pq.add(rem2);
            }
        }
        
        Pair rem = pq.remove();
        answer.add(new ArrayList<>(List.of(rem.start,rem.end)));
        
        return answer.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        
    }
}