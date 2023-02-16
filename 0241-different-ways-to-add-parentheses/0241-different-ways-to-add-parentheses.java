class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return ToCompute(expression);
    }
    public static List<Integer> ToCompute(String expression){
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            // Retrive the first character of the string 
            char ch=expression.charAt(i);
            if(ch=='*' || ch=='+' || ch=='-'){
                // Find the left string to calculate the result
                String left=expression.substring(0,i);
                // Find the right string to calculate the result
                String right=expression.substring(i+1);
                // store the result in the list of left ans right portion
                List<Integer> left_list=ToCompute(left);
                List<Integer> right_list=ToCompute(right);
                // perform the Arithmetics operation on left and right part
                for(int x:left_list){
                    for(int y:right_list){
                        if(ch=='-'){
                            ans.add(x-y);
                        }
                        else if(ch=='+'){
                            ans.add(x+y);
                        }
                        else if(ch=='*'){
                            ans.add(x*y);
                        }
                    }
                }

            }
        }
        if(ans.size()==0)
            ans.add(Integer.valueOf(expression));
        return ans;
    }
}