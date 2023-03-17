class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String y=paragraph.replaceAll("[^A-Za-z]"," ");
        String a[]=y.split(" ");
        Map<String,Integer> m=new LinkedHashMap<>();
        int f=0;
        for(String s:a){
            s=s.toLowerCase();
           for(int i=0;i<banned.length;i++){
               if(banned[i].contains(s)){
                   f=1;
                   break;
               }
               else{
                   f=0;
               }
           }
           if(f==0){
            if(!(m.containsKey(s))){
                m.put(s,1);
            }
            else{
                m.put(s,m.get(s)+1);
            }
           }
        }
        // System.out.print(q+" ");
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        int max=0;
        String h="";
        for(String g:m.keySet()){
        
                int n=m.get(g);
                if(max<n){
                    max=n;
                    h=g;
                }
            
        }
        return h;
    }
}