class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int answer[]=new int[n];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int strat=intervals[i][0];
            arr[i]=strat;
            map.put(strat,i);
        }
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            int end=intervals[i][1];
            
            if(arr[n-1]<end){
                answer[i]=-1;
            }
            else{
                int first=0;
                int last=n-1;
                int ans=0;
                while(first<=last){
                    int mid=first+(last-first)/2;
                    if(arr[mid]>=end){
                        ans=arr[mid];
                        last=mid-1;
                    }
                    else{
                        first=mid+1;
                    }
                }
                answer[i]=map.get(ans);
            }
        }
        
        return answer;
    }
}