class Solution {
    int array1[];
    int tempMargeArray[];
    int length;
    public void margeArray(int LowerIndex,int middle,int HigherIndex)
    {
        for(int i=LowerIndex;i<=HigherIndex;i++)
        {
            tempMargeArray[i]=array1[i];
        }
        int i=LowerIndex;
        int j=middle+1;
        int k=LowerIndex;
        while(i<=middle&&j<=HigherIndex)
        {
            if(tempMargeArray[i]<=tempMargeArray[j])
            {
                array1[k]= tempMargeArray[i];
                i++;
            }
            else {
                array1[k]=tempMargeArray[j];
                j++;
            }k++;
        }
        while (i<=middle)
        {
            array1[k]=tempMargeArray[i];
            k++;
            i++;
        }
    }
    public void DivideMethod(int LowerIndex,int HigherIndex)
    {
       if(LowerIndex<HigherIndex)
       {
           int middle=LowerIndex+(HigherIndex-LowerIndex)/2;
           DivideMethod(LowerIndex,middle);
           DivideMethod(middle+1,HigherIndex);
           margeArray(LowerIndex,middle,HigherIndex);
       }

    }
    public void Short(int IndexArray[])
    {
        this.array1=IndexArray;
        this.length=array1.length;
        this.tempMargeArray=new int[length];
        DivideMethod(0,length-1);
    }
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        Short(nums);
        
        return nums[nums.length-k];
    }
}