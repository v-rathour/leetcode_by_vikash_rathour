class Solution {
    public int largestInteger(int num) {
        // Space Complexity = n/2 + n/2
        // Time Comeplexity = n + n
        PriorityQueue<Integer> pqOdd = new PriorityQueue();
        PriorityQueue<Integer> pqEven = new PriorityQueue();
        int temp = num;
        while(num > 0){
            int digit = num % 10;
            num = num / 10;
            if(digit % 2 == 0){
                //even = 0
                // zero is considered as even
                pqEven.offer(digit);
            } else {
                //odd 1
                pqOdd.offer(digit);
            }
        }
        int newNum=0, index = 0;
        while(temp > 0){
            int parity = temp % 10;
            int digit = 0;
            if(parity % 2 == 0){
                //even
                digit = pqEven.poll();
            } else {
                //odd
                digit = pqOdd.poll();
            }
            newNum = (digit * (int)Math.pow(10, index)) + newNum;
            temp = temp / 10;
            index++;
        }
        return newNum;
    }
}