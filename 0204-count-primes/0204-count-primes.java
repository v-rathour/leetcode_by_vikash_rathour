class Solution {
    public int countPrimes(int n) {
        if(n==0|| n==1){
            return 0;
        }
       return sieve_of_eretoshenes(n);
    }
    
    public int sieve_of_eretoshenes(int n){
        boolean arr[]=new boolean[n];
        arr[0]=arr[1]=true;
        for(int i=2;i<arr.length;i++){
            if(!arr[i]){
                for(int j=2;j*i<arr.length;j++){
                    arr[i*j]=true;
                }
            }
        }
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                count++;
            }
        }
        
        return count;
    }
}