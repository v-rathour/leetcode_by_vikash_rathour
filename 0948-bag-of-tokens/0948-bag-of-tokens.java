class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        Arrays.sort(token);
        int i = 0;
        int j = token.length-1;
        int score = 0;
        
        while(i<=j){
            
            if(token[i]<=power){
                power -= token[i];
                score++;
                i++;
            }
            else if(i != j && score>=1){
                power += token[j];
                score--;
                j--;
            }
            else{
                i++;
                j--;
            }
            
        }
        
        return score;
    }
}