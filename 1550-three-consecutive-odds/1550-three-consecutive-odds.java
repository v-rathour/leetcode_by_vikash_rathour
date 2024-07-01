class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int sum = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                sum = 0;
            }
            else{
                sum++;
            }
            
            if(sum == 3){
                return true;
            }
        }
        
        return false;
    }
}