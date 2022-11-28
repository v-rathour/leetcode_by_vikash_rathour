class Solution {
    public int firstUniqChar(String str) {
        
        int arr[]=new int[256];

          for(int i=0;i<str.length();i++){
              arr[str.charAt(i)-'a']++;
          }
          int ans=-1;
          for(int i=0;i<str.length();i++){

              if(arr[str.charAt(i)-'a']==1){
                    ans=i;
                    break;
              }
          }

         if(ans==-1)
            return -1;
         else{
            return ans; 
        }
        
    }
    
}