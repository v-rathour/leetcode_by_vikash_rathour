class Solution {
    
    public static class Pair{
        int value;
        int level;
        public Pair(int value,int level){
            this.value=value;
            this.level=level;
        }
    }
    
    public boolean isBipartite(int[][] graph) {
        
        
        int[] visited = new int[graph.length];
        Arrays.fill(visited,-1);
        
        for (int i = 0; i < visited.length; i++) {

            if(visited[i]==-1){
                if(!CheckBipartite(i,visited,graph)){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
    public  boolean CheckBipartite(int src,int[] visited,int[][] graph){

        Queue<Pair> q=new ArrayDeque<>();

        q.add(new Pair(src,0));

        while(!q.isEmpty()){
            Pair rem=q.poll();

            if(visited[rem.value] != -1){
                if(rem.level != visited[rem.value]){
                    return false;
                }
            }
            else{
                visited[rem.value]=rem.level;
            }

            for(int i = 0;i<graph[rem.value].length;i++){
                if(visited[graph[rem.value][i]]==-1){
                    q.add(new Pair(graph[rem.value][i], rem.level+1));
                }
            }
        }

        return true;
    }
}