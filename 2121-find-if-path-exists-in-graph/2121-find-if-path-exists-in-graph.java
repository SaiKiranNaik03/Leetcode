class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<Integer>());
        for(int ed[] : edges){
            arr.get(ed[0]).add(ed[1]);
            arr.get(ed[1]).add(ed[0]);
        }

        boolean visit[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visit[source] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int nd : arr.get(node)){
                if(visit[nd] == false){
                    q.add(nd);
                    visit[nd] = true;
                }
            }
        }
        return visit[destination];
    }
}