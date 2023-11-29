public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        if(n == -2147483648){
            return 1;
        }
        System.out.println(n);
        if(n>=0){
            int count = 0;
            while(n != 0){
                int rem = n%2;
                if(rem == 1){
                    count++;
                }
                n /= 2;
            }
            
            return count;
            
        }
        else{
            
            int count = 0;
            int i = 0;
            int flag = 0;
            n = Math.abs(n);
            while(n != 0){
                int rem = n%2;
                
                if(flag == 1 && rem == 0){
                    count++;
                }
                
                if(flag == 0 && rem == 1){
                    flag = 1;
                    count++;
                   
                }
                
                i++;
                // System.out.println(n);
                n /= 2;
            }
            // System.out.println(i+" "+count);
            int temp = 32-i;
            return count+temp;
            
        }
    }
}