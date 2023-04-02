class RecentCounter {
    List<Integer> list;
    public RecentCounter() {
        list=new ArrayList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        int min=t-3000;
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=min && list.get(i)<=t){
                count++;
            }
        }
        
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */