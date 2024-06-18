class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int[][]a=new int[difficulty.length][2];
        
        for(int i=0;i<difficulty.length;i++){
            a[i][0]=difficulty[i];
            a[i][1]=profit[i];
        }
        
        Arrays.sort(a,(c,b)->Integer.compare(c[0],b[0]));
        
        Arrays.sort(worker);
        
        int ans=0;
        int maxP=0;
        int j=0;
        
        for(int i=0;i<worker.length;i++){
            
            while(j<a.length && a[j][0]<=worker[i]){
                maxP=Math.max(maxP,a[j][1]);
                j++;
            }
            ans+=maxP;
        }
        return ans;
    }
}