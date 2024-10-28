class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        
        while(num != 0){
            if(num%2 != 0 ){
                count++;
                num--;
            }
            
            if(num == 0){
                break;
            }
            
            num /= 2;
            count++;
            // System.out.println(num);
        }
        
        
        
        return count;
    }
}