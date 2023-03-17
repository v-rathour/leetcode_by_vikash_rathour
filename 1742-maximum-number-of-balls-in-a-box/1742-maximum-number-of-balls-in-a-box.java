class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=Integer.MIN_VALUE;
        for(int i=lowLimit;i<=highLimit;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int rev=num%10;
                sum=sum+rev;
                num=num/10;
            }
            
            if(map.containsKey(sum)==false){
                 map.put(sum,1);
            }
            else{
                map.put(sum,map.get(sum)+1);
                
            }
            if(count<map.get(sum)){
                    count=map.get(sum);
            }
        }
        
        return count;
    }
}