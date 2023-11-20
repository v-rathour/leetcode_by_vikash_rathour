class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int totaltraverl[] = new int[travel.length+1];
        
        for(int i = 0;i<travel.length;i++){
            
            totaltraverl[i+1] = travel[i]+totaltraverl[i];
            
        }
        
        int p = -1;
        int pc = 0;
        int g = -1;
        int gc = 0;
        int m = -1;
        int mc = 0;
        
        for(int i = 0;i<garbage.length;i++){
            StringBuilder s = new StringBuilder(garbage[i]);
            
            for(int j = 0;j<s.length();j++){
                char ch = s.charAt(j);
                
                if(ch == 'P'){
                    p = Math.max(i,p);
                    pc++;
                }
            
                if(ch == 'M'){
                    m = Math.max(i,m);
                    mc++;
                }

                if(ch == 'G'){
                    g = Math.max(i,g);
                    gc++;
                }
                
            }
            
        }
        
        int ans = 0;
        
        if(p != -1){
            ans += pc;
            ans += totaltraverl[p];
        }
        
        if(m != -1){
            ans += mc;
            ans += totaltraverl[m];
        }
        
        if(g != -1){
            ans += gc;
            ans += totaltraverl[g];
        }
        
        return ans;
        
    }
}