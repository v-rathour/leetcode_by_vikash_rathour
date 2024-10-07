class Solution {
    public int minLength(String s) {
        if (s.length() == 1) {
            return s.length();
        }

        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        while (i < sb.length() - 1) {
            char c = sb.charAt(i);
            char cNext = sb.charAt(i+1);
            if ((c == 'A' && cNext == 'B') || (c == 'C' && cNext == 'D')) {
                sb = sb.delete(i, i + 2);
                i = (i <= 1) ? 0 : i - 1;
            } else {
                i++;
            }
        }

        return sb.length();   
    }
}