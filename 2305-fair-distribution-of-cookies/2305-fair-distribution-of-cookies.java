class Solution {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        
        int arr[] = new int[k];
        Unfairness(cookies,arr,0,Integer.MIN_VALUE);
        
            return ans;
    }
    
    public void Unfairness(int[] cookies,int array[],int idx,int max){
        
        if(idx == cookies.length){
            
            ans = Math.min(ans,max);
            return;
        }
        
        for(int i=0;i<array.length;i++){
            array[i] += cookies[idx];
            Unfairness(cookies,array,idx+1,Math.max(max,array[i]));
            array[i] -= cookies[idx];
        }
    }
}