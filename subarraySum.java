class Solution {
    public int subarraySum(int[] nums, int k) {
        return subarray(nums,k);
    }
    public static int subarray(int arr[],int k){
        int ans=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum +=arr[i];
           if(map.containsKey(sum-k)){
               ans +=map.get(sum-k);

           }
           map.put(sum,map.getOrDefault(sum,0)+1);
       }
       return ans;
    }
}
