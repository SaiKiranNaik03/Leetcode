class Pair{
    int first;
    int second;
    Pair(int fst, int scd){
        this.first = fst;
        this.second = scd;
    }
}
class Solution {
    static void bfs(int r, int c, int vist[][], char grid[][]){
        Queue<Pair> q = new LinkedList<Pair>();
        vist[r][c]=1;
        q.add(new Pair(r,c));
        while(!q.isEmpty()){
            int ro = q.peek().first;
            int co = q.peek().second;
            q.remove();
            int n = grid.length;
            int m = grid[0].length;
            for(int dr=-1;dr<=1;dr++){
                for(int dc=-1;dc<=1;dc++){
                    int nr= ro + dr;
                    int nc = co + dc;
                    if((nr == ro || nc == co) && nr>=0 && nr <n && nc>=0 && nc < m && grid[nr][nc] == '1' && vist[nr][nc] == 0){
                        q.add(new Pair(nr,nc));
                        vist[nr][nc]=1;
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        int vist[][] = new int[n][m];
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(vist[r][c] == 0 && grid[r][c] == '1'){
                    count++;
                    bfs(r, c, vist, grid);
                }
            }
        }
        return count;
    }
}