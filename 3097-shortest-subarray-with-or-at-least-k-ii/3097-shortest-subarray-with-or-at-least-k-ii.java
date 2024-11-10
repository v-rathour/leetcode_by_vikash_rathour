class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        
        int ans = Integer.MAX_VALUE;
        
        int arr[] = new int[32];
        
        int i = 0;
        int j = 0;
        
        int xor = 0;
        
        while(j<nums.length){
            
            if(nums[j]>=k){
                return 1;
            }
            add(arr,nums[j]);
            
            while(num(arr)>=k ){
                
                ans = Math.min(ans,j-i+1);
                sub(arr,nums[i]);
                
                i++;
            }
            
            j++;
        }
        
        
        
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        
        return ans;
    }
    
    public void add(int []arr,int num){
        for(int i = 0;i<32;i++){
            arr[i] += ((num>>i)&1);
        }
    }
    
    public void sub(int []arr,int num){
        for(int i = 0;i<32;i++){
            arr[i] -= ((num>>i)&1);
        }
    }
    
    public int num(int arr[]){
        int x = 0;
        
        for(int i = 0;i<32;i++){
            if(arr[i]>0){
                x += (1<<i);
            }
        }
        
        return x;
    }
}