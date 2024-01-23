class Solution {
    public int maxLength(List<String> arr) {
        return Subsequence(arr,0,0,new HashSet<>());
    }
    
    public static int Subsequence(List<String> arr,int i, int n, HashSet<Character> set){
        if(arr.size() == i){
            return n;
        }

        HashSet<Character> charc = new HashSet<>();
        int count = 0;
        for (int j = 0; j < arr.get(i).length(); j++) {
            char ch = arr.get(i).charAt(j);
            if(!set.contains(ch) && !charc.contains(ch)){
                count++;
            }
            charc.add(ch);
        }


        int a = 0;
        if(count == arr.get(i).length()){

            set.addAll(charc);
            a = Subsequence(arr,i+1,n+arr.get(i).length(),set);
            set.removeAll(charc);
        }
        int b = Subsequence(arr,i+1,n,set);


        return Math.max(a,b);
    }
}