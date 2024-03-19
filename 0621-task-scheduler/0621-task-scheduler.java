

class Solution {
    public int leastInterval(char[] tasks, int p) {
        int n = tasks.length;
        Map<Character, Integer> mp = new HashMap<>();
        for(char ch : tasks) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int time = 0;
        for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
            pq.offer(entry.getValue());
        }
        while(!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for(int i = 1; i <= p+1; i++) {
                if(!pq.isEmpty()) {
                    temp.add(pq.poll() - 1);
                }
            }
            for(int freq : temp) {
                if(freq > 0) {
                    pq.offer(freq);
                }
            }
            if(pq.isEmpty()) {
                time += temp.size();
            } else {
                time += (p+1);
            }
        }
        return time;
    }
}

