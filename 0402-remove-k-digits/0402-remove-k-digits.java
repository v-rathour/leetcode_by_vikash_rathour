class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> q = new Stack<>();
        
        for(int i = 0;i<num.length();i++){
            char ch = num.charAt(i);
            int n = Integer.parseInt(ch+"");
            
            // System.out.println(q+" "+n);
            
            while(q.size()>0 && q.peek()>n && k != 0){
                q.pop();
                k--;
            }
            
            if(!q.isEmpty() || n !=0)
            {
                   q.push(n);
            }
            
        }
        
        while(!q.isEmpty() && k != 0){
            q.pop();
            k--;
        }
        
        if(q.isEmpty()){
            return "0";
        }
        
        StringBuilder str = new StringBuilder();
        
        while(!q.isEmpty()){
            int n = q.pop();
            str.append(n+"");
        }
        
        return str.reverse().toString();
        
        
        
       
        
    }
}