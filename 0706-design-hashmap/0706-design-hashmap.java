class MyHashMap {
    // It is batter ways for construct
    List<Integer[]> lists;
    public MyHashMap() {
        lists=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean changedValue=false;
            if(lists.size()==0){
                lists.add(new Integer[]{key,value});
            }
            else{
                for(Integer[] li : lists){
                    if(li[0]==key){
                        changedValue=true;
                        li[1]=value;
                    }
                }
                if(!changedValue){
                    lists.add(new Integer[]{key,value});
                }
            }
    }
    
    public int get(int key) {
        for(Integer[] li:lists){
            if(li[0]==key){
                return li[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(Integer[] li:lists){
            if(li[0]==key){
                lists.remove(li);
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */