class Solution {
    
    public  class Pair implements Comparable<Pair>{
        int node;
        double weight;

        public Pair(int node,double weight){
            this.node=node;
            this.weight=weight;
        }

        @Override
        public int compareTo(Pair obj) {
           if(this.weight>obj.weight)
               return -1;
            return 1;
        }
    }
    
    public class Eages {
        int src;
        int nbr;
        double weight;

        public Eages(int src,int nbr,double weight){
            this.src=src;
            this.nbr=nbr;
            this.weight=weight;
        }

    }

    LinkedList<Eages> Adjecent[];
    

    public void addNode(int start,int end,double weight){
        Adjecent[start].add(new Eages(start,end,weight));
        Adjecent[end].add(new Eages(end,start,weight));
    }
    
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Adjecent=new LinkedList[n];
        for(int i=0;i<n;i++){
            Adjecent[i]=new LinkedList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            
            addNode(x,y,succProb[i]);
        }
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        boolean visited[] = new boolean[n];
        pq.add(new Pair(start,1));
        
        while(!pq.isEmpty()){
            
            Pair rem = pq.poll();
            
            if(rem.node == end){
                return rem.weight;
            }
            
            visited[rem.node] = true;
            for(Eages node : Adjecent[rem.node]){
                if(visited[node.nbr]==false){
                    pq.add(new Pair(node.nbr,rem.weight*node.weight));
                }
            }
        }
        
        return 0.0;
        
    }
    
    
   
}