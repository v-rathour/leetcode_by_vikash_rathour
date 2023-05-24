class Solution {
    public String largestNumber(int[] nums) {
        
        ArrayList<String> sortedDigits = new ArrayList<>();
        for(int num : nums){
            sortedDigits.add(Integer.toString(num));
        }

        Collections.sort(sortedDigits, (a, b) -> {
            return (b + a).compareTo(a + b);
        });

        StringBuilder sb = new StringBuilder();

        for(String digit : sortedDigits){
            sb.append(digit);
        }

        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
