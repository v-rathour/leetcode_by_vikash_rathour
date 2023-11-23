class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        int n = nums.length;
        int m = l.length;
        List<Boolean> answer = new ArrayList<>();
        
        for(int i = 0;i<m;i++){
            
            int start = l[i];
            int end = r[i];
            
            boolean ans = SubArray(start,end,nums);
            answer.add(ans);
            
        }
        
        return answer;
        
    }
    
    
    public boolean SubArray(int start,int end,int[]nums){
        
        int size = end-start+1;
        int []temp = new int[size];
        
        for(int i = start,j = 0;i<=end;i++,j++){
            temp[j] = nums[i];
        }
        
        Arrays.sort(temp);
        if(size == 1){
            return false;
        }
        
        int diff = 0;
        if(size >= 2){
            diff = temp[1]-temp[0];
        }
        
        for(int i = 1;i<temp.length-1;i++){
            
            if(temp[i+1]-temp[i] != diff){
                return false;
            }  
        }
        
        return true;
    }
}