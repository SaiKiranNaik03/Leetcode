class Solution {
    static void dfs(int ro, int co, int vist[][], char mat[][], int dr[], int dc[]) {
        vist[ro][co] = 1;
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < 4; i++) {
            int nr = ro + dr[i];
            int nc = co + dc[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && vist[nr][nc] == 0 && mat[nr][nc] == 'O') {
                dfs(nr, nc, vist, mat, dr, dc);
            }
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        
        int n = board.length;
        int m = board[0].length;
        int vist[][] = new int[n][m];
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O' && vist[0][i] == 0) {
                dfs(0, i, vist, board, dr, dc);
            }
            if (board[n - 1][i] == 'O' && vist[n - 1][i] == 0) {
                dfs(n - 1, i, vist, board, dr, dc);
            }
        }

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && vist[i][0] == 0) {
                dfs(i, 0, vist, board, dr, dc);
            }
            if (board[i][m - 1] == 'O' && vist[i][m - 1] == 0) {
                dfs(i, m - 1, vist, board, dr, dc);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && vist[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
