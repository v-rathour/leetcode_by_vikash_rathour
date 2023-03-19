class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //If it's opening bracket, push them in a stack
            if(ch == '(') {
                open.push(i);
            }
            // If it's a star then push them in a second stack
            else if(ch == '*') {
                star.push(i);
            }
            else {
               /* If the character is closing bracket, then there are three cases.
               1) If the first stack is not empty, first pop them from that stack. 
               2) If it's empty check in a second stack, Pop them from that.
               3) If both of them empty then return false. */
                if(!open.isEmpty()) {
                    open.pop();
                }
                else if(!star.isEmpty()) {
                    star.pop();
                }
                else {
                    return false;
                }
            }
        }
        
        // Now process leftover opening bracket
        while(!open.isEmpty()) 
        {
            if(star.isEmpty()) {
                return false;
            }
            // star is lying to the right hand side of opening bracket
            else if(open.peek() < star.peek()) {
                open.pop();
                star.pop();
            }
            else {          // CASE: open.top() > start.pop() 
                return false;
            }
        }
        return true;
    }
}