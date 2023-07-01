class Solution {
    
    public class Eages {
        int src;
        int nbr;
        
        public Eages(int src,int nbr){
            this.src=src;
            this.nbr=nbr;
        }

    }
    
    public void addNode(int start,int end){
        Adjecent[start].add(new Eages(start,end));
    }
    
    
    LinkedList<Eages> Adjecent[];
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        
        Adjecent=new LinkedList[n+1];
        
        for(int i=0;i<=n;i++){
            Adjecent[i]=new LinkedList<>();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(isConnected[i][j] != 0){
                        addNode(i+1,j+1);
                    }
                }
            }
        }
        
        
        int count = 0;
        
        boolean visited[] = new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(visited[i]==false){
                count++;
                ConnectedComponent(i,visited);
            }
        }
        
        return count;
    }
    
    public void ConnectedComponent(int src,boolean visited[]){
        visited[src] = true;
        for(Eages node:Adjecent[src]){
            if(visited[node.nbr]==false){
                ConnectedComponent(node.nbr,visited);
            }
        }
    }
}