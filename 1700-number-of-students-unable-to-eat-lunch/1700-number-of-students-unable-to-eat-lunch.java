class Solution {
    
    public int countStudents(int[] students, int[] sandwiches) {
        
        int studentSet = 0;
        int studentOff = 0;
        
        for(int i = 0;i<students.length;i++){
            if(students[i] == 0){
                studentOff++;
            }
            else{
                studentSet++;
            }
        }
        
        for(int sandwich : sandwiches){
            if(sandwich == 0){
                if(studentOff == 0){
                    return studentSet;
                }
                studentOff--;
            }
            else{
                if(studentSet == 0){
                    return studentOff;
                }
                studentSet--;
            }
        }
        
        return 0;
        
    }
}