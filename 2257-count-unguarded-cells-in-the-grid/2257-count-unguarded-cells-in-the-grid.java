class Solution {
    public void markGuarded(int[][] room, int i, int j, int m, int n) {
    
        for (int y = j + 1; y < n; y++) {
            if (room[i][y] == 2 || room[i][y] == 1) break;
            room[i][y] = 3;
        }
        for (int y = j - 1; y >= 0; y--) {
            if (room[i][y] == 2 || room[i][y] == 1) break;
            room[i][y] = 3;
        }
        for (int x = i + 1; x < m; x++) {
            if (room[x][j] == 2 || room[x][j] == 1) break;
            room[x][j] = 3;
        }
        for (int x = i - 1; x >= 0; x--) {
            if (room[x][j] == 2 || room[x][j] == 1) break;
            room[x][j] = 3;
        }
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] room = new int[m][n];

        for (int[] wall : walls) {
            room[wall[0]][wall[1]] = 2;
        }

        for (int[] guard : guards) {
            room[guard[0]][guard[1]] = 1;
        }

        for (int[] guard : guards) {
            markGuarded(room, guard[0], guard[1], m, n);
        }

        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (room[i][j] == 0) {
                    unguarded++;
                }
            }
        }
        return unguarded;
    }
}