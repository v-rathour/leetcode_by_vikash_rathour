class Solution {
    public void gameOfLife(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int [][]ans = new int[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int ones = 0;
                
                if((i-1)>=0 && (j-1)>=0){
                    ones += arr[i-1][j-1] == 1?1:0;
                }
                
                if((i-1)>=0){
                     ones += arr[i-1][j]== 1?1:0;
                }
                
                if((j-1)>=0){
                     ones += arr[i][j-1]== 1?1:0;
                }
                
                if((i-1)>=0 && (j+1)<m){
                     ones += arr[i-1][j+1]== 1?1:0;
                }
                
                if((i+1)<n && (j-1)>=0){
                     ones += arr[i+1][j-1]== 1?1:0;
                }
                
                if((i+1)<n){
                     ones += arr[i+1][j]== 1?1:0;
                }
                
                if((j+1)<m){
                     ones += arr[i][j+1]== 1?1:0;
                }
                
                if((i+1)<n && (j+1)<m){
                     ones += arr[i+1][j+1] == 1?1:0;;
                }
                
                
                int temp = arr[i][j];
                if(arr[i][j] == 0){
                    if(ones == 3){
                        temp = 1;
                    }
                }
                else{
                    if(ones<=1 || ones>3){
                        temp = 0;
                    }
                }
                
                ans[i][j] = temp;
                
            }
            
        }
        
       for(int i = 0;i<n;i++){
           for(int j = 0;j<m;j++){
               arr[i][j] = ans[i][j];
           }
       }
        
        return;
        
    }
}