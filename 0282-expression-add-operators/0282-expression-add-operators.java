class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        backtrack(res, num, target, "", 0, 0, 0);
        return res;
    }
    
    private void backtrack(List<String> res, String num, int target, String ans, int index, long eval, long prev) {
        
    if (index == num.length()) {
        if (eval == target) {
            res.add(ans);
        }
        return;
    }
        
    for (int i = index; i < num.length(); i++) {
        if (i != index && num.charAt(index) == '0') {
            break;
        }
        
        long curr = Long.parseLong(num.substring(index, i + 1));
        
        if (index == 0) {
            backtrack(res, num, target, ans + curr, i + 1, curr, curr);
        } 
        else {
            backtrack(res, num, target, ans + "+" + curr, i + 1, eval + curr, curr);
            backtrack(res, num, target, ans + "-" + curr, i + 1, eval - curr, -curr);
            // this concept, I understamd through a hint no 4
            backtrack(res, num, target, ans + "*" + curr, i + 1, eval - prev + prev * curr, prev * curr);
            }
           
        }
    }
}