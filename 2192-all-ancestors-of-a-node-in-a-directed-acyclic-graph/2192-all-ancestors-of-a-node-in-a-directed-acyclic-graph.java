class Solution {
    
    public class Eages{
        int src ;
        int nbr ;
        
        public Eages(int src,int des){
            this.src = src;
            this.nbr = des;
        }
    }
    
    LinkedList<Eages> Adjecent[];
    
    public void addNode(int start,int end){
        
        Adjecent[end].add(new Eages(end,start));
    }
    
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> getAncestors(int n, int[][] edgeList) {
        
        Adjecent =new LinkedList[n];
        
        for(int i=0;i<n;i++){
            Adjecent[i] = new LinkedList<>();
        }
        
        for(int i=0;i<edgeList.length;i++){
            
            int x = edgeList[i][0];
            int y = edgeList[i][1];
            
            
            addNode(x,y);
        }
        
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            
            boolean visited[] = new boolean[n];
            
            visited[i] = true;
            
            dfs(i, visited);
            Collections.sort(list);
            ans.add(new ArrayList(list));
            list=new ArrayList();
        }
        return ans;
    }
    
    public void dfs(int num, boolean visited[]){
        
        for(Eages node: Adjecent[num]){
            
            if(!visited[node.nbr]){
                
                visited[node.nbr]=true;
                list.add(node.nbr);
                dfs(node.nbr, visited);
                
            }
        }
        
    }
}