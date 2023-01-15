class N_Queens_Solution {
    static List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        result=new ArrayList<>();
        char chess[][]=new char[n][n];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j]='.';
            }

        }
         ArrayList<int[]> queen=new ArrayList<>();
        print_position(chess,0,queen);
        return result;
    }
    public static void print_position(char chess[][],int row,ArrayList<int[]> queen){
        if(queen.size()==chess.length){
            List<String> r=new ArrayList<>();
            for (char[] n: chess ) {
                r.add(new String(n));
            }
            result.add(r);
        }
        for (int i = 0; i < chess.length; i++) {
            if(isvisited(queen,row,i)){
                chess[row][i]='Q';
                queen.add(new int[]{row,i});
                print_position(chess,row+1,queen);
                chess[row][i]='.';
                queen.remove(queen.size()-1);
            }
        }
    }
    public static boolean isvisited(List<int[]> queen,int row,int col){
        for(int[] q: queen){
            int dx=Math.abs(row-q[0]);
            int dy=Math.abs(col-q[1]);
            if(dx==0 || dy==0 || dx==dy)
                return false;
        }
        return true;
    }
}
