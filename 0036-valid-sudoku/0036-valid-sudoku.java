class Solution {
    static boolean ans;
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> s=new HashSet<>();
       for(int i=0;i<9;i++){
           for(int j=0;j<9;j++){
               if(board[i][j]!='.'){
                   // add the element position which is parasent in board
                   String row="row"+i+board[i][j];
                   String col="col"+j+board[i][j];
                   // It is calculate the box index in board 
                   // first box from (0,2).(2,2)
                   String box="box"+((i/3)*3+(j/3))+board[i][j];
                   if(s.contains(row)==false && s.contains(col)==false && s.contains(box)==false){
                       s.add(row);
                       s.add(col);
                       s.add(box);
                   }
                   else{
                       return false;
                   }

               }
           }
       }
       return true;
    }
}
        