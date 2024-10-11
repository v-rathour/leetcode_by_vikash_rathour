public class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        
       
        int[][] friends = new int[n][3];
        for (int i = 0; i < n; i++) {
            friends[i][0] = times[i][0];  
            friends[i][1] = times[i][1];  
            friends[i][2] = i;           
        }
        
        
        Arrays.sort(friends, Comparator.comparingInt(a -> a[0]));

        
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.offer(i);  
        }

        PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int[] friend : friends) {
            int arrival = friend[0];
            int leave = friend[1];
            int index = friend[2];

            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= arrival) {
                availableChairs.offer(occupiedChairs.poll()[1]); 
            }

            int assignedChair = availableChairs.poll();

            if (index == targetFriend) {
                return assignedChair;
            }

            occupiedChairs.offer(new int[] {leave, assignedChair});
        }
         return -1;
    }
}