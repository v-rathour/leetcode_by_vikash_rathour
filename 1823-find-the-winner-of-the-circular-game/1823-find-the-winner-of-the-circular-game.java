class Solution {
    public int findTheWinner(int n, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            dq.addLast(i);
        }
        int j=0;
        while(dq.size()!=1){
            int temp=dq.pollFirst();
            j++;
            if(j==k){
               j=0; 
            }
            else{
               dq.addLast(temp); 
            }
        }
        
        return dq.peek();
    }
}