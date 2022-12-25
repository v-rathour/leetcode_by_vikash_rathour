class Solution {
    String removeDups(String S) {
        // code here
          int arr[]=new int[26];
          for(int i=0;i<S.length();i++){
              arr[S.charAt(i)-'a']++;
          }
          String str="";
          for(int i=0;i<S.length();i++){
              if(arr[S.charAt(i)-'a']>=1){
                  str +=S.charAt(i);
                  arr[S.charAt(i)-'a']=0;
              }
          }
          return str;
    }
}
