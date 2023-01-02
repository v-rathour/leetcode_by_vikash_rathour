class Mountain_Array{
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){
            return false;
        }
        int i=1;
        for(;i<arr.length;i++){
            if(arr[i-1]==arr[i])
                return false;
            if(arr[i-1]>=arr[i])
                  break;
        }
        if(i==1 ||i==arr.length)
           return false;
        for(;i<arr.length;i++){
            if(arr[i-1]<=arr[i])
                return false;
        }
        return true;
    }
}
