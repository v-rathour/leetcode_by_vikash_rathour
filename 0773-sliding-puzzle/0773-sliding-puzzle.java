class Solution {
    public int slidingPuzzle(int[][] board) {
        
        Queue<String> queue=new LinkedList<>();
        String str = "123450";

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                sb.append(board[i][j]);
            }
        }

        int swapArr[][] = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{4,2}};

        String initial = sb.toString();
        int level = 0;
        HashSet<String> set=new HashSet<>();

        queue.add(initial);
        set.add(initial);

        while(!queue.isEmpty()){

            int size = queue.size();

            while(size-->0){

                String rem = queue.remove();
                if(rem.equals(str)){
                    return level;
                }
                int idx=-1;

                for(int i=0;i<rem.length();i++){
                    if(rem.charAt(i)=='0'){
                        idx = i;
                        break;
                    }
                }

                int swap[] = swapArr[idx];

                for (int i = 0; i <swap.length ; i++){
                    String tobeadded = SwapCharater(rem,idx,swap[i]);
                    if(set.contains(tobeadded)){

                        continue;
                    }
                    queue.add(tobeadded);
                    set.add(tobeadded);
                }
            }
            level++;
        }

        return -1;
    }
    
    public  String SwapCharater(String st,int i,int j){
        StringBuilder sb=new StringBuilder(st);
        sb.setCharAt(i,st.charAt(j));
        sb.setCharAt(j,st.charAt(i));

        return sb.toString();
    }
}