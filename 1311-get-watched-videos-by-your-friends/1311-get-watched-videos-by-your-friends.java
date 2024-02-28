class Solution {
    
    class Pair implements Comparable<Pair>{
        
        String s;
        int freq;
        
        Pair(String s,int freq){
            this.freq = freq;
            this.s = s;
        }

        @Override
        public int compareTo(Pair o) {
            return (this.freq == o.freq)?this.s.compareTo(o.s):this.freq-o.freq;
        }
    }
    
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        
        for(int i = 0;i<friends.length;i++){
            adj.put(i,new ArrayList<>());
        }
        
        for(int i = 0;i<friends.length;i++){
            for(int j = 0;j<friends[i].length;j++){
                adj.get(i).add(friends[i][j]);
            }
        }
        
        // System.out.println(adj);
        
        
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        
        boolean visited[] = new boolean[friends.length];
        int l = 0;
        visited[id] = true;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            if(l == level){
                break;
            }
            
            for(int i = 0;i<size;i++){
                
                int rem = q.remove();
                
                List<Integer> list = adj.get(rem);
                for(int j = 0;j<list.size();j++){
                    if(!visited[list.get(j)]){
                        q.add(list.get(j));
                        visited[list.get(j)] = true;
                    }
                }
                
            }
            
            l++;
            
        }
        
        HashMap<String,Integer> map = new HashMap<>();
        while(!q.isEmpty()){
            
            int rem = q.poll();
            
            for(String vid: watchedVideos.get(rem)){
                map.put(vid,map.getOrDefault(vid,0)+1);
            }
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(String key : map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        
        List<String> answer = new ArrayList<>();
        while(!pq.isEmpty()){
            Pair rem = pq.remove();
            // System.out.println(rem.s+" "+rem.freq);
            answer.add(rem.s);
        }
        
        
        return answer;
        
    }
}