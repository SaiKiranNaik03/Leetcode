class Pair{
    int first, second;
    int dist;
    Pair(int fst, int scd, int d){
        this.first = fst;
        this.second = scd;
        this.dist = d;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int vist[][] = new int[n][m];
        int distance[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<Pair>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    q.add(new Pair(i,j,0));
                    vist[i][j]=1;
                }else{
                    vist[i][j]=0;
                }
            }
        }

        int dr[] = {1,-1,0,0};
        int dc[] = {0,0,-1,1};
        while(!q.isEmpty()){
            int ro = q.peek().first;
            int co = q.peek().second;
            int d = q.peek().dist;
            distance[ro][co] = d;
            q.remove();
            for(int i=0;i<4;i++){
                int nr = ro + dr[i];
                int nc = co + dc[i];
                if(nr >=0 && nr <n && nc >=0 && nc <m && vist[nr][nc] == 0){
                    vist[nr][nc] = 1;
                    q.add(new Pair(nr, nc, d + 1));
                }
            }
        }
        return distance;
    }
}