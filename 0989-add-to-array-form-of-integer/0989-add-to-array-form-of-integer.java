class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         List<Integer> list=new ArrayList<>();
         int carry=0;
         for(int i=num.length-1;i>=0;i--)
         {
             if(k>0)
             {
                 int rem=k%10;
                 k=k/10;
                 int t=rem+num[i]+carry;
                 list.add(t%10);
                 carry=t/10;
             }
             else
             {
                 list.add((carry+num[i])%10);
                 carry=(carry+num[i])/10;
             }
         }
         while(k>0)
         {
             int rem=k%10;
             list.add((rem+carry)%10);
             carry=(rem+carry)/10;
             k=k/10;
         }
         if(carry>0)
            list.add(carry);

         
        Collections.reverse(list);
        return list;
    }
}