class Solution {
    public int compareVersion(String version1, String version2) {
         String []s1 = version1.split("\\.");
         String []s2 = version2.split("\\.");
         int i = 0;
         for(;i<Math.min(s1.length,s2.length);i++){
             int n1 = Integer.parseInt(s1[i]);
             int n2 = Integer.parseInt(s2[i]);
             
             if(n1 == n2){
                 continue;
             }
             else if(n1>n2){
                 return 1;
             }
             else{
                 return -1;
             }
         }
        
         while(i<s1.length){
             int n1 = Integer.parseInt(s1[i]);
             if(n1 != 0){
                 return 1;
             }
             i++;
         }
        
        while(i<s2.length){
            int n2 = Integer.parseInt(s2[i]);
            if(n2 != 0){
                return -1;
            }
            i++;
        }
        
        return 0;
    }
}