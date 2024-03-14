class Solution {
    
    int []parent;
    int []rank;
    
    int find(int x){
        if(x == parent[x]){
            return x;
        }
        
        return parent[x] = find(parent[x]);
    }
    
    void union(int x,int y){
        
        int x_parent = find(x);
        int y_parent = find(y);
        
        if(x_parent == y_parent){
            return;
        }
        
        if(rank[x_parent]<rank[y_parent]){
            parent[x_parent] = y_parent;
        }
        else if(rank[x_parent]>rank[y_parent]){
            parent[y_parent] = x_parent;
        }
        else{
            parent[y_parent] = x_parent;
            rank[x_parent]++;
        }
        
    }
    
    public boolean equationsPossible(String[] equations) {
        
        parent = new int[26];
        rank = new int[26];
        
        for(int i = 0;i<26;i++){
            parent[i] = i;
        }
        
        for(String s: equations){
            
            int fch = s.charAt(0)-'a';
            int lch = s.charAt(3)-'a';
            char mch = s.charAt(1);
            
            if(mch == '='){
                union(fch,lch);
            }
            
        }
        
        for(String s:equations){
            int fch = s.charAt(0)-'a';
            int lch = s.charAt(3)-'a';
            char mch = s.charAt(1);
            
            if(mch == '!'){
                int fch_parent = find(fch);
                int lch_parent = find(lch);
                
                if(fch_parent == lch_parent){
                    return false;
                }
            }
                
                
        }
        
        return true;
        
    }
}