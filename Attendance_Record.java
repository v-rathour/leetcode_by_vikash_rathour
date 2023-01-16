class Attendance_Record{
    public boolean checkRecord(String s) {
        return Record(s);
    }
    public static boolean Record(String str){
        int count=0;
        int late=0;
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           
           if(ch=='A'){
               late=0;
               count++;
           }
           else if(ch=='L'){
               late++;
           }
            else{
                late=0;
            }
           if(count>=2 || late>=3)
              return false;
       }
       return true;
    }
    
}
