class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int i=0;
        int j=people.length-1;
        int count=0;
        Arrays.sort(people);
        while(i<=j){
           if(people[i]+people[j]<=limit){
               count++;
               i++;
               j--;
           }
            else{
                count++;
                j--;
            }

        }
        return count;
    }
    
    
}