class Solution {
    public int getWinner(int[] arr, int k) {
        
        int max = arr[0];
        int count =0;
        
        for(int i=1;i<arr.length;i++){
            
            int temp = Math.max(max,arr[i]);
            
            if(temp==max)
                count++;
            else{
                count =1;
                max = temp;
            }
            
            if(count==k)
                break;
            
        }
        
        return max;
    }
}