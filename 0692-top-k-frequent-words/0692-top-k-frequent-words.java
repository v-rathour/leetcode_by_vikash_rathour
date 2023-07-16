class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        
        List<String> ans = new ArrayList<>();
        
        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            
            (e1,e2) -> e1.getValue() == e2.getValue() ? 
            e1.getKey().compareTo(e2.getKey()) : e2.getValue() - e1.getValue()
        );
        
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            pq.offer(entry);
        }

        for(int i=0;i<k;i++) {
            ans.add(pq.poll().getKey());
        }

        return ans;
    }
}