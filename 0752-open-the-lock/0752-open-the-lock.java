class Solution {
    public void fillNeighbors(Queue<String> que, StringBuilder curr, Set<String> dead) {
        for (int i = 0; i < 4; i++) {
            char ch = curr.charAt(i);

            char dec = (ch == '0') ? '9' : (char) (ch - 1);
            char inc = (ch == '9') ? '0' : (char) (ch + 1);

            curr.setCharAt(i, dec);
            String decStr = curr.toString();
            if (!dead.contains(decStr)) {
                dead.add(decStr);
                que.add(decStr);
            }

            curr.setCharAt(i, inc);
            String incStr = curr.toString();
            if (!dead.contains(incStr)) {
                dead.add(incStr);
                que.add(incStr);
            }
            curr.setCharAt(i, ch);
        }
    }

    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for (String deadend : deadends) {
            dead.add(deadend);
        }

        String start = "0000";
        if (dead.contains(start)) {
            return -1;
        }

        Queue<String> que = new LinkedList<>();
        que.add(start);

        int level = 0;
        while (!que.isEmpty()) {
            int n = que.size();

            while (n-- > 0) {
                String curr = que.poll();
                if (curr.equals(target)) {
                    return level;
                }

                StringBuilder currBuilder = new StringBuilder(curr);
                fillNeighbors(que, currBuilder, dead);
            }
            level++;
        }
        return -1;
    }
}