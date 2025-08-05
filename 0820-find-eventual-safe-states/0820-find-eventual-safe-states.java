class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        ArrayList<ArrayList<Integer>> revGraph = new ArrayList<>();
        int[] inDeg = new int[V];
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < V; i++) revGraph.add(new ArrayList<>());

        for (int i = 0; i < V; i++) {
            for (int nbr : graph[i]) {
                revGraph.get(nbr).add(i);
                inDeg[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDeg[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);
            for (int prev : revGraph.get(node)) {
                inDeg[prev]--;
                if (inDeg[prev] == 0) q.add(prev);
            }
        }
        Collections.sort(res);
        return res;
    }
}
