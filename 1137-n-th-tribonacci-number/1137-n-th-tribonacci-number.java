class Solution {
    public int tribonacci(int n) {
        
        int arr[] = new int[40];
        
        arr[1] = 1;
        arr[2] = 1;
        
        if(n == 0 || n == 1 || n == 2){
            return arr[n];
        }
        
        int ans = 0;
        for(int i = 0;i<=n-3;i++){
            ans = arr[i]+arr[i+1]+arr[i+2];
            arr[i+3] = ans; 
        }
        
        return ans;
        
    }
}