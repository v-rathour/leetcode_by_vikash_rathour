class Solution {
    
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<matches.length;i++){
            int a[] = matches[i];
            if(!map.containsKey(a[0])){
                map.put(a[0],0);
            }
            
            if(!map.containsKey(a[1])){
                map.put(a[1],1);
            }
            else{
                map.put(a[1],map.get(a[1])+1);
            }
            
           
        }
        
        List<Integer> winteam = new ArrayList<>();
        List<Integer> one_lost_team = new ArrayList<>();
        for(int n : map.keySet()){
            if(map.get(n) == 0){
                winteam.add(n);
            }

            if(map.get(n) == 1){
                one_lost_team.add(n);
            }
        }

        Collections.sort(winteam);
        Collections.sort(one_lost_team);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(winteam);
        answer.add(one_lost_team);

        return answer;
        
    }
}