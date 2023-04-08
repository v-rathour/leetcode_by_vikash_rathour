class Solution {
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new LinkedList<>();
        int n = arr.length;
        int i = 0;
        int j = n - k;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        for(int l = i; l < i + k; l++)
            list.add(arr[l]);
        return list;
    }
}