class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)){
                    boolean ans=SearchWord(board,word,i,j,0);
                    if(ans){
                        return true;
                    }
                }

            }
        }
        return false;
    }
    public static boolean SearchWord(char ch[][],String word,int row,int col,int idx){
        if(idx==word.length()){
            return true;
        }
        if( row<0 || col<0 || row>=ch.length || col>=ch[0].length   || word.charAt(idx)!=ch[row][col]){
            return false;
        }
        int arrrow[]={-1,1,0,0};
        int arrcol[]={0,0,-1,1};
        ch[row][col]='*';
        boolean ans=false;
        for (int i = 0; i < arrcol.length; i++) {
            ans=SearchWord(ch,word,row+arrrow[i],col+arrcol[i],idx+1);
            if(ans){
                return ans;
            }
        }
        ch[row][col]=word.charAt(idx);

        return false;

    }
}