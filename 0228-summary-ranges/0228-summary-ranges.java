class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            String str="";
            str=nums[i]+"";
            while(i<nums.length-1 && (nums[i+1]-nums[i])==1){
                i++;
            }
            
            if(nums[i]!=Integer.parseInt(str)){
                str +="->"+nums[i];
                list.add(str);
            }
            else{
                list.add(str);
            }
            i++;
        }
        
         return list;
    }
}