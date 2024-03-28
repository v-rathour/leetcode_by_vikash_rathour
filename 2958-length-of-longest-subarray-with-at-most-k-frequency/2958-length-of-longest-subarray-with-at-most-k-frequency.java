class Solution {
    
    public int maxSubarrayLength(int[] arr, int k) {
        
        int result=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int i=0;
        int j=0;
        
        while(i<arr.length){
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            // find the frequency of the element
            if(map.get(arr[i])>k){
                
                while(j<i && map.get(arr[i])>k){
                
                    if(map.get(arr[j])==1)
                        map.remove(arr[j]);
                    
                    else
                        map.put(arr[j],map.get(arr[j])-1);
                    j++;
                }
            }
            result=Math.max(result,i-j+1);
            i++;
        }
        
       
        if(result<0)
            return 0;
        
        return result;
    }
    
}