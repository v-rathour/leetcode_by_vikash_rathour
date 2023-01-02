class Relative_Sort_Array_Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])==false)
                map.put(arr1[i],1);
            else
                map.put(arr1[i],map.get(arr1[i])+1);
        }
        int j=0;
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                int k=0;
                while(k<map.get(arr2[i])){
                    arr1[j]=arr2[i];
                    j++;
                    k++;
                }
            }
            map.remove(arr2[i]);
        }
        int i=j;
        for(int key:map.keySet()){
            int k=0;
            while(k<map.get(key)){
                  arr1[i]=key;
                   k++;
                   i++;
            }
        }
        Arrays.sort(arr1,j,arr1.length);
        return arr1;
    }
}
