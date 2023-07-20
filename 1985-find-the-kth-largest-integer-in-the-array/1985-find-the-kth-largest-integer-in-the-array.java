class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>((x, y) -> {
            
            if (x.length() != y.length()) {
                return x.length() - y.length();
            } else {
                return x.compareTo(y);
            }
        });
        

        for (String num : nums) {
            
            pq.add(num);
            
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
        
    }
}