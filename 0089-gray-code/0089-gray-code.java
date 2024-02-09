class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> answer = new ArrayList<>();
        ArrayList<StringBuilder> str = solution(n);
        
        for(StringBuilder s : str){
            answer.add(ReturnDecimalNumber(s));
        }
        
        return answer;
    }
    
    public  ArrayList<StringBuilder> solution(int n){

        if(n == 1){
            ArrayList<StringBuilder> curr = new ArrayList<>();
            curr.add(new StringBuilder("0"));
            curr.add(new StringBuilder("1"));
            return curr;
        }

        ArrayList<StringBuilder> previous = solution(n-1);
        ArrayList<StringBuilder> answer = new ArrayList<>();
        for (int i = 0; i < previous.size(); i++) {
            answer.add(new StringBuilder("0"+previous.get(i)));
        }

        for (int i = previous.size()-1; i >=0 ; i--) {
            answer.add(new StringBuilder("1"+previous.get(i)));
        }

        return answer;
    }
    
    public int ReturnDecimalNumber(StringBuilder a){
        int n = 0;
        
        for(int i = a.length()-1;i>=0;i--){
            char ch = a.charAt(i);
            if(ch == '1'){
                n += (1<<(a.length()-i-1));
            }
        }
        
        return n;
    }
}