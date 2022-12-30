class  Reversing_Subarrays_Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<target.length;i++){
            if(map1.containsKey(target[i])==false)
               map1.put(target[i],1);
            else
               map1.put(target[i],map1.get(target[i])+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map2.containsKey(arr[i])==false)
               map2.put(arr[i],1);
            else
               map2.put(arr[i],map2.get(arr[i])+1);
        }
        for(int n:map1.keySet()){
            if(map2.containsKey(n)){
                if(map1.get(n)!=map2.get(n))
                     return false;
            }
            else
               return false;
        }
        return true;
    }
}
