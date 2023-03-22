class Solution {
    public double myPow(double x,int n){
       if(n<0)
       {
           n=n*-1;
           x=1/x;
       }
       double m=recursion(x,n);
        return m;
    }
     public  double  recursion(double x,int n){
        if(n==0)
            return 1;
         double t=recursion(x,n/2);
         double ans=t*t;
         if(n%2!=0)
         {
             ans=ans*x;
         }
         return ans;
    }
}