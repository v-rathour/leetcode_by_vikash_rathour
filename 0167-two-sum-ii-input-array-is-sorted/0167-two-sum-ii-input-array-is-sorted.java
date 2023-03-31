class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        int i=0,j=numbers.length-1;
    while(i<numbers.length-1){
            if(numbers[i]+numbers[j]==target){
                a[0]=i+1;
                a[1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]>target){
               j--;
            }
            else{
                i++;
            }        }
        return a;       
    }
}