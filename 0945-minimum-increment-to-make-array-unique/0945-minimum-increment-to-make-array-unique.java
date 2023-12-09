class Solution {
    public int minIncrementForUnique(int[] ar) {
        Arrays.sort(ar);
        int sum = 0;
        for (int i = 1; i < ar.length; i++) {
          if (ar[i] <= ar[i - 1]) {
            sum += ar[i - 1] - ar[i] + 1;
            ar[i] = ar[i - 1] + 1;
          }
        }
        return sum;
  }
}