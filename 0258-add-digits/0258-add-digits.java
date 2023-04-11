class Solution {
    public int addDigits(int num) {
        long m=(long)num;
        while(m>=10){
            long sum=0;
            long copy=m;
            while(copy!=0){
                long rev=copy%10;
                sum +=rev;
                copy /=10;
            }
            
            m=sum;
        }
        
        return (int)m;
    }
}