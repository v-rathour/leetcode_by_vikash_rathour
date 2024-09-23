class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));
        
        int n = s.length();
        int[] arr= new int[n + 1]; 
        
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + 1; 
            
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (set.contains(sub)) {
                    arr[i] = Math.min(arr[i], arr[j]);
                }
            }
        }
        
        return arr[n];
    }
}