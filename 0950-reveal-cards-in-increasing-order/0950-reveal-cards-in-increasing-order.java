class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int ans[] = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0;i<deck.length;i++){
            q.add(i);
        }
        
        Arrays.sort(deck);
        int k = 0;
        while(q.size()>=2){
            int i = q.remove();
            int j = q.remove();
            
            ans[i] = deck[k];
            q.add(j);
            k++;
            
        }
        
        ans[q.remove()] = deck[k];
        
        return ans;
    }
}