class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
          List<Boolean> list=new ArrayList<>();
          int max=Integer.MIN_VALUE;
          for(int i=0;i<candies.length;i++){
              max=Math.max(max,candies[i]);
          }
        System.out.println(max);
          for(int i=0;i<candies.length;i++){
              int sum=extraCandies+candies[i];
              if(sum>=max){
                  list.add(true);
              }
              else{
                  list.add(false);
              }
          }
        
        return list;
    }
}