class Solution {

    public List<String> buildArray(int[] target, int n) {
        HashSet<Integer> set = new HashSet<>();
        int c = target.length;
        for(int i = 0;i<c;i++){
            set.add(target[i]);
        }
        
        List<String> list = new ArrayList<>();
        int count = 1;
        while(count <=n){
            
            if(set.contains(count)){
                list.add("Push");
            }else{
                list.add("Push");
                list.add("Pop");
            }
            if(count == target[c-1]){
                break;
            }
            count++;
        }
        
        return list;
    }
}