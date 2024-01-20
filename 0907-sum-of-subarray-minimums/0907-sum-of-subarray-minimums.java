

class Solution {
    public int sumSubarrayMins(int[] A) {
        int n = A.length;
        int MOD = 1000000007;
        int[] left = new int[n];
        int[] right = new int[n];

        // Left Stack
        Stack<Integer> leftStack = new Stack<>();
        leftStack.push(0);

        left[0] = 1; // distance = 1

        for (int i = 1; i < n; i++) {
            while (!leftStack.isEmpty() && A[i] < A[leftStack.peek()])
                leftStack.pop();

            if (leftStack.isEmpty())
                left[i] = i + 1; // total distance if less element not found = i+1
            else
                left[i] = i - leftStack.peek(); // distance = i - leftStack.peek()

            leftStack.push(i);
        }

        // Right Stack
        Stack<Integer> rightStack = new Stack<>();
        rightStack.push(n - 1);

        right[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            while (!rightStack.isEmpty() && A[i] <= A[rightStack.peek()])
                rightStack.pop();

            if (rightStack.isEmpty())
                right[i] = n - i; // distance
            else
                right[i] = rightStack.peek() - i;

            rightStack.push(i);
        }

        // for each value, we have left and right contribution will be (Left * Right) * Element
        long res = 0;
        for (int i = 0; i < n; i++) {
            long prod = (long) (left[i] * right[i]) % MOD;
            long net = (long) A[i] * prod;
            res = (res + net) % MOD;
        }

        return (int) (res % MOD);
    }
}