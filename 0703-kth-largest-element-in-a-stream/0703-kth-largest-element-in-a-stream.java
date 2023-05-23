import java.util.*;
class KthLargest {
    int k;
    List<Integer> list=new ArrayList<>();;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        int n=list.size()-k;
        return list.get(n);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */