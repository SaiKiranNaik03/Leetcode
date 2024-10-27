class Solution {
    
    public static void dfs(int node, ArrayList<ArrayList<Integer>> rep2,int visit[]){
        visit[node]=1;
        for(Integer n : rep2.get(node)){
            if(visit[n] == 0){
                visit[n]=1;
                dfs(n,rep2,visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> rep2 = new ArrayList<>();
        
        for(int i=0;i<v;i++){
            rep2.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v; j++){
                if(i!=j && isConnected[i][j]==1){
                    rep2.get(i).add(j);
                }
            }
        }
        
        int visit[] = new int[v+1];
        int c=0;
        
        for(int i=0;i<v;i++){
            if(visit[i] == 0){
                c++;
                dfs(i,rep2,visit);
            }
        }
        return c;
    }
}