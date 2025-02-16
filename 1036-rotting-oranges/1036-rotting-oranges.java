import java.util.*;

class Pair {
    int row, col, tm;
    Pair(int r, int c, int t) {
        this.row = r;
        this.col = c;
        this.tm = t;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vist[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0, rotten = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vist[i][j] = 2;
                }
                if (grid[i][j] == 1) fresh++;
            }
        }
        
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, -1, 0, 1};
        int t = 0;
        
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int ro = p.row;
            int co = p.col;
            int time = p.tm;
            t = Math.max(t, time);
            
            for (int i = 0; i < 4; i++) {
                int nr = ro + row[i];
                int nc = co + col[i];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1 && vist[nr][nc] != 2) {
                    q.add(new Pair(nr, nc, time + 1));
                    vist[nr][nc] = 2;
                    rotten++;
                }
            }
        }
        
        return (rotten == fresh) ? t : -1;
    }
}
