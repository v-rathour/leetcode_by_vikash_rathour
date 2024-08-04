class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum=0;
        final int mod=(int)1e9+7;
        int[] temp=  new int[n*(n+1)/2];
        int total=0;
        for(int i=0,k=0;i<n;i++){
            total=0;
            for(int j=i;j<n;j++){
            total+=nums[j];
            temp[k++]=total;
            }
        }
        Arrays.sort(temp);
        for(int i=left-1;i<right;i++){
            sum=(sum+temp[i])%mod;
        }
        return sum;
    }
}