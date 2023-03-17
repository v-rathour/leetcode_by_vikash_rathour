class Solution {
    public boolean makeEqual(String[] words) {
       int[] arr = new int[26];
       int n = words.length;

       for(String word : words)
           for(char c : word.toCharArray())
               arr[(int)(c - 'a')]++;   

       for(int i = 0; i < 26; i++)
          if(arr[i] % n != 0) return false;
        return true;
    }
}