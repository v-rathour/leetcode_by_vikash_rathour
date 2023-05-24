class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> (a[0]==b[0]?b[1]-a[1]:a[0]-b[0]));
        
        int curr=intervals[0][1];
        int cover=0;
        for(int i=1;i<intervals.length;i++){
           if(intervals[i][1]<=curr){
             cover++;
             continue;
           }
           curr=intervals[i][1];
        }
        return intervals.length-cover;

        
    }
}