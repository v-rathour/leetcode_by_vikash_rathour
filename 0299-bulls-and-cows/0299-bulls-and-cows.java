class Solution {
    public String getHint(String s, String g) {
        
        StringBuilder secret = new StringBuilder(s);
        StringBuilder guess = new StringBuilder(g);
 
        int[] secretarr = new int[10];
        int[] guessarr = new int[10];
        int bull = 0;
        
        for(int i = 0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            }
            else{
                secretarr[secret.charAt(i)-'0']++;
                guessarr[guess.charAt(i)-'0']++;
            }
        }
        
        int cow = 0;
        for(int i = 0;i<10;i++){
            cow += Math.min(secretarr[i],guessarr[i]);
        }
        
        return (bull+"A"+cow+"B");
        
    }
}