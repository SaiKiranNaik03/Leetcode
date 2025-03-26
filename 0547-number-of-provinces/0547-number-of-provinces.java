class Solution {
    public static void bfs(int start, ArrayList<ArrayList<Integer>> rep, int vist[]){
        Queue<Integer> q = new LinkedList<>();
        vist[start] = 1;
        q.add(start);
        while(!q.isEmpty()){
            int nd = q.peek();
            q.poll();
            for(Integer n : rep.get(nd)){
                if(vist[n] == 0){
                    vist[n]=1;
                    q.add(n);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> rep = new ArrayList<>();
        for(int i=0;i<v;i++){
            rep.add(new ArrayList<>());
        }

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(i!=j && isConnected[i][j]==1){
                    rep.get(i).add(j);
                }
            }
        }
        int c=0;
        int vist[] = new int[v];
        for(int i=0;i<v;i++){
            if(vist[i] != 1){
                c++;
                bfs(i,rep,vist);
            }
        }
        return c;
    }
}