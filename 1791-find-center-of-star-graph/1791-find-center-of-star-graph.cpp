class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        map<int,int> Map;
        
        for(vector<int> list : edges){
            int u = list[0];
            int v = list[1];
            
            if(Map.find(u) == Map.end()){
                Map[u] = 0;
            }
            
            if(Map.find(v) == Map.end()){
                Map[v] = 0;
            }
            
            Map[u]++;
            Map[v]++;
        }
        
        int ans = 0;
        for(auto it = Map.begin();it!=Map.end();it++){
            // cout<<it->first<<" "<<it->second<<endl;
            if(it->second == edges.size()){
                ans = it->first;
                break;
            }
        }
        
        return ans;
    }
};