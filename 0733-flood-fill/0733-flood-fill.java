import java.util.*;

class Pair {
    int first, second;
    Pair(int fst, int scd) {
        this.first = fst;
        this.second = scd;
    }
}

class Solution {
    static void bfs(int sr, int sc, int cl, int color, int[][] temp, int[][] vist) {
        int n = temp.length;
        int m = temp[0].length;
        
        vist[sr][sc] = 1;
        temp[sr][sc] = color;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int ro = p.first;
            int co = p.second;
            
            for (int i = 0; i < 4; i++) {
                int nr = ro + dRow[i];
                int nc = co + dCol[i];
                
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && vist[nr][nc] == 0 && temp[nr][nc] == cl) {
                    vist[nr][nc] = 1;
                    temp[nr][nc] = color;
                    q.add(new Pair(nr, nc));
                }
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int[][] temp = new int[n][m];
        int[][] vist = new int[n][m];
        int cl = image[sr][sc];
        
        for (int i = 0; i < n; i++) {
            System.arraycopy(image[i], 0, temp[i], 0, m);
        }
        
        // if (cl != color) {
            bfs(sr, sc, cl, color, temp, vist);
        // }
        
        return temp;
    }
}
