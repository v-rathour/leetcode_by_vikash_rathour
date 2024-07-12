class Solution {
    public int maximumGain(String s, int x, int y) {
      Stack<Character> st=new Stack<>();
      StringBuilder str=new StringBuilder(s);
       int ans=0;
       if(x<y)
       {
        int temp=x;
        x=y;
        y=temp;
        s=str.reverse().toString();
       }
       str.setLength(0);
      for(char ch: s.toCharArray())
      {
        if(!st.isEmpty() &&(st.peek()=='a' && ch=='b'))
        {
            st.pop();
            ans+=x;
        }
        else{
            st.push(ch);
        }
      }
      while(!st.isEmpty())
      {
        str.append(st.pop());
      }
      str.reverse();
     for(char ch: str.toString().toCharArray())
     {
        if(!st.isEmpty() &&(st.peek()=='b' && ch=='a'))
        {
            st.pop();
            ans+=y;
        }
        else
        {
            st.push(ch);
        }
     }
     return ans;
    }
}