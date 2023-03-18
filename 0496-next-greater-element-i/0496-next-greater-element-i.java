class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Map_next_greater(nums2,map);
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
    public void Map_next_greater(int arr[],HashMap<Integer,Integer> map){
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        map.put(arr[arr.length-1],-1);
        for (int i = arr.length-2; i>=0; i--) {
            while(st.size()>0 && st.peek()<=arr[i]) {
                st.pop();
            }
            if(st.size()==0){
                 map.put(arr[i],-1);
            }
            else{
                map.put(arr[i],st.peek());
            }
            st.push(arr[i]);
        }
    }
}