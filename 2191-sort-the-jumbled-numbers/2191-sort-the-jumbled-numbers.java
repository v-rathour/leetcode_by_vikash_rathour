class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer, Deque<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int newNum = 0;
            String oldNum = nums[i] + "";
            for (char c: oldNum.toCharArray()) {
                newNum = (newNum * 10) + (mapping[c - '0']);
            }

            map.putIfAbsent(newNum, new ArrayDeque<>());
            map.get(newNum).addLast(nums[i]);
            nums[i] = newNum;
        }
        

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]).removeFirst();
        }

        return nums;
        
    }
}