class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return permutation(s1,s2);
    }
     public static boolean permutation(String s1,String s2){
        int arr[]=new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            arr[ch-'a']++;
        }
       
        
        int trap[]=new int[26];
        int ei=0;
        int si=0;
        while(ei<s2.length()){

            char ch=s2.charAt(ei);
            trap[ch-'a']++;
            ei++;
            

            while(arr[ch-'a']<trap[ch-'a'] && si<=ei){
                
                 trap[s2.charAt(si)-'a']--;
                 si++;

            }
           
            if(s1.length()==(ei-si)){
                return true;
            }
        }

        return false;
    }
    
}