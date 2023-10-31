class Solution {
    public int numSplits(String s) {
        
        int []left = new int[s.length()];
        int []right = new int[s.length()];
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                count++;
            }
            left[i] = count;
        }
        count = 0;
        set = new HashSet<>();
        for (int i = s.length()-1; i >=0; i--) {
            char ch = s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                count++;
            }
            right[i] = count;
        }
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
           if(left[i] == right[i+1]){
               ans++;
           }
        }
        
        return ans;
        
    }
}