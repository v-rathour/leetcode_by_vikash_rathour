class Solution {
    
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        Arrays.sort(arr);
        if(arr[0] != 1){
            arr[0] = 1;
        }
        
        for(int i = 1;i<arr.length;i++){
            if((arr[i]-arr[i-1]) <= 1){
                    continue;
            }
            else{
                arr[i] = arr[i-1]+1;
            }
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        
        return max;
    }
}