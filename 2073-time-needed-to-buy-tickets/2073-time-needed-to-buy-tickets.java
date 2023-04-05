class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int top=q.poll();
            tickets[top]=tickets[top]-1;
            count++;
            if(top==k && tickets[top]==0 ){
                break;
            }
            
            if(tickets[top]!=0){
                q.add(top);
            }
        }
        
        return count;
    }
}