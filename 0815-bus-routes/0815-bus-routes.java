class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<routes.length;i++){

            for (int j = 0; j < routes[i].length; j++) {

                if(!map.containsKey(routes[i][j])){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(i);
                    map.put(routes[i][j],list);
                }
                else{

                    ArrayList<Integer> list=map.get(routes[i][j]);
                    list.add(i);
                    map.put(routes[i][j],list);
                }
            }
        }

        HashSet<Integer> busno = new HashSet<>();
        HashSet<Integer> bustopvis = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int level = 0;

        queue.add(source);
        bustopvis.add(source);

        while(!queue.isEmpty()){

            int size = queue.size();

            while(size>0){

                int rem = queue.remove();

                if(rem==target){
                    
                    return level;
                }

                ArrayList<Integer> bus_no = map.get(rem);
                for(int buses:bus_no){

                    if(busno.contains(buses)){
                        continue;
                    }

                    busno.add(buses);
                    int arr[]= routes[buses];
                    for(int route:arr){

                        if(bustopvis.contains(route)){
                            continue;
                        }

                        bustopvis.add(route);

                        queue.add(route);
                    }
                }

                size--;
            }

            level++;
        }

        return -1;
        
    }
}