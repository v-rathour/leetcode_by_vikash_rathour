class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        Deque<Integer> st1=new ArrayDeque<>();
        Deque<Integer> st2=new ArrayDeque<>();
        
        int num=newInterval[0];
        int flag=0;
        for(int []arr:intervals){
            int first=arr[0];
            if(flag==0 && first>=num){
                flag=1;
                st1.addLast(newInterval[0]);
                st2.addLast(newInterval[1]);
            }
            
            st1.addLast(arr[0]);
            st2.addLast(arr[1]);
        }
        
        if(flag==0){
            st1.addLast(newInterval[0]);
            st2.addLast(newInterval[1]);
        }
        
        List<List<Integer>> list=new ArrayList<>();
        overlappingIntervals(st1,st2,list);
        
        return list.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }
    
    public void overlappingIntervals(Deque<Integer> st1,Deque<Integer> st2,List<List<Integer>> list){
        
        while(st1.size()>=2){
           int st1_val1=st1.pollFirst();
           int st2_val1=st2.pollFirst();
           
           int st1_val2=st1.pollFirst();
           int st2_val2=st2.pollFirst();
            
           if(st2_val1>=st1_val2){
               st1.addFirst(st1_val1);
               st2.addFirst(Math.max(st2_val1,st2_val2));
           }
           else{
               List<Integer> ll=new ArrayList<>();
               ll.add(st1_val1);
               ll.add(st2_val1);
               list.add(ll);
               
               st1.addFirst(st1_val2);
               st2.addFirst(st2_val2);
           }
        }
        
        List<Integer> ll=new ArrayList<>();
        ll.add(st1.peek());
        ll.add(st2.peek());
        list.add(ll);
    }
}