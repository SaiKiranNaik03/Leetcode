class Solution {
    static boolean bfs(int src, int color[], int graph[][]){
        color[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int ele : graph[node]){
                if(color[ele] == -1){
                    color[ele] = 1 - color[node];
                    q.add(ele);
                }
                if(color[ele] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int color[] = new int[v];
        for(int i=0;i<v;i++){
            color[i]=-1;
        }
        for(int i=0;i<v;i++){
            if(color[i] == -1){
                if(!bfs(i, color, graph)) return false;
            }
        }
        return true;
    }
}