class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list=new ArrayList<>();
        IP_Address(s,0,"",list);
        return list;
    }
    public static void IP_Address(String str,int count,String ans,List<String> list){
        if(count<4 && str.length()==0){
            return;
        }
        if(count==4 ){
            if(str.length()==0){
                list.add(ans.substring(0,ans.length()-1));
            }
            return;
        }
        for (int i = 0; i < 3 && str.length()>i; i++) {
            String left=str.substring(0,i+1);
            String right= str.substring(i+1);
            if(isvalid(left)){
                IP_Address(right,count+1,ans+left+".",list);
            }
        }
    }
    public static boolean isvalid(String ans){
        if(ans.length()==1)
            return true;
        if(ans.charAt(0)=='0')
            return false;
        int num=Integer.parseInt(ans);
        if(num>=0 && num<256)
            return true;
        return false;
    }
}