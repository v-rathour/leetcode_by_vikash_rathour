class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int num=asteroids[i];
            if(num>=0){
                st.push(num);
            }
            else{
                int flag=0;
                while(!st.isEmpty()){
                    if(st.peek()<0){
                        break;
                    }
                    
                    if(st.peek()>Math.abs(num) ){
                        flag=1;
                        break;
                    }
                    
                    if(st.peek()==Math.abs(num)){
                        flag=1;
                        st.pop();
                        break;
                    }
                    if(st.peek()<Math.abs(num)){
                        st.pop();
                    }
                }
                
                if(flag==0){
                    st.push(num);
                }
            }
        }
        int arr[]=new int[st.size()];
        int i=arr.length-1;
        while(!st.isEmpty()){
            arr[i]=st.pop();
            i--;
        }
        
        return arr;
    }
}