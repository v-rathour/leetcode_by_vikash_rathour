class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        ArrayList<Integer> minList = new ArrayList<Integer>();
        ArrayList<Integer> maxList = new ArrayList<Integer>();

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        for(int i = 0; i < rowLength; i++){
            int min = -1;
            for(int j = 0; j < colLength; j++){
                int num = matrix[i][j];
                if((num < min) || min == -1) min = num;
            }
            minList.add(min);
        }

        for(int i = 0; i < colLength; i++){
            int max = -1;
            for(int j = 0; j < rowLength; j++){
                int num = matrix[j][i];
                if(num > max) max = num;
            }
            maxList.add(max);
        }

        for(int i = 0; i < minList.size(); i++){
            for(int j = 0; j < maxList.size(); j++){
                int min = minList.get(i);
                int max = maxList.get(j);
                if(min == max){
                    int luckyNum = maxList.get(j);
                    return new ArrayList<>(){{
                        add(luckyNum);
                    }};
                }
            }
        }

        return new ArrayList<>(){};
    }
}