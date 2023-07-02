class Solution {
    int ans = Integer.MAX_VALUE;
    public int minimumTimeRequired(int[] jobs, int k) {
        
        int arr[] = new int[k];
        TimeRequried(jobs,0,arr,Integer.MIN_VALUE);
        
        return ans;
        
    }
    
    public void TimeRequried(int jobs[],int idx,int arr[],int max){
        
        if(idx == jobs.length){
            ans = Math.min(max,ans);
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] += jobs[idx];
            TimeRequried(jobs,idx+1,arr,Math.max(max,arr[i]));
            arr[i] -= jobs[idx];
            if(arr[i]==0){
                break;
            }
        }
    }
    
    
}