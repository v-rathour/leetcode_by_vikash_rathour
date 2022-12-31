class Shuffle_string_Solution {
    public String restoreString(String s, int[] indices) {
      
       char arr[]=new char[indices.length];
      
       for(int i=0;i<indices.length;i++){
           arr[indices[i]]=s.charAt(i);
       }
      
       String str="";
      
       for(int i=0;i<indices.length;i++){
             str=str+arr[i];
       } 
       return str;
    }
}
