class Pair{
    int first, second;
    Pair(int fst, int scd){
        this.first = fst;
        this.second = scd;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vist[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<m;i++){
            if(grid[0][i] == 1 && vist[0][i] == 0){
                vist[0][i] = 1;
                q.add(new Pair(0,i));
            }

            if(grid[n-1][i] == 1 && vist[n-1][i] == 0){
                vist[n-1][i] =1;
                q.add(new Pair(n-1, i));
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1 && vist[i][0] == 0){
                vist[i][0] = 1;
                q.add(new Pair(i,0));
            }

            if(grid[i][m-1] == 1 && vist[i][m-1] == 0){
                vist[i][m-1] =1;
                q.add(new Pair(i, m-1));
            }
        }

        int dr[] ={0,0,1,-1};
        int dc[] = {1,-1,0,0};
        while(!q.isEmpty()){
            int ro = q.peek().first;
            int co = q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
                int nr = ro + dr[i];
                int nc = co + dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && vist[nr][nc] == 0 && grid[nr][nc] == 1){
                    q.add(new Pair(nr,nc));
                    vist[nr][nc] = 1;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vist[i][j] == 0 && grid[i][j] == 1){
                    c++;
                }
            }
        }
        return c;
    }
}