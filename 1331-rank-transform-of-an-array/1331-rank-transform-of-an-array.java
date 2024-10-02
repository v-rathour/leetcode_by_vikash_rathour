class Solution {
    public int[] arrayRankTransform(int[] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0;i<arr.length;i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i],rank);
               rank++;
           }
        }
        
        for(int i = 0;i<a.length;i++){
            a[i] = map.get(a[i]);
        }
        
        return a;
    }
}