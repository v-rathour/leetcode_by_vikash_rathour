class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        int n = pq.remove();
        int m = pq.remove();
        
        return (n-1)*(m-1);
        
    }
}