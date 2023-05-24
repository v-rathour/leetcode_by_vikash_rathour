
class Solution {
	public long[] getDistances(int[] arr) {
	   int n = arr.length;
		long[] result = new long[n];
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i=0; i<n; i++) {
			List<Integer> list = map.getOrDefault(arr[i], new ArrayList<>());
			list.add(i);
			map.put(arr[i], list);
		}
		for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
			List<Integer> list = entry.getValue();
			long sum = 0;
			for (int num: list) {
				sum += (long) num;
			}
             
			long preSum = 0;
			int size = list.size();
            
			for (int i=0; i<size; i++) {
				int num = list.get(i);
				preSum += num;
               
				result[num] = sum + (2*i+2-size)*(long)num - 2*preSum;
			}
            
		}
		return result; 
	}
}