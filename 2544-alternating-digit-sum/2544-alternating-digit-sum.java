class Solution {
    static int sum;
    public int alternateDigitSum(int n) {
        sum=0;
        String str=n+"";
        DigitSum(str,0);
        return sum;
    }
    public static void DigitSum(String str,int count){
        if(str.length()==0){
            return;
        }
        char ch=str.charAt(0);
        int n=ch-'0';
        if(count%2==0)
               sum +=n;
        else
            sum -=n;
        DigitSum(str.substring(1),count+1)  ; 
    }
}